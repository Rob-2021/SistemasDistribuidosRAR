/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1amachuy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ServidorBanco extends UnicastRemoteObject implements IBanco {

    public ServidorBanco() throws RemoteException {
        super();
    }

    @Override
    public Factura[] calcular(int idcliente) throws RemoteException{
        try {
            ICessa cessa;
            cessa = (ICessa) Naming.lookup("rmi://localhost/OperacionesCessa");
            Factura[] aux = cessa.pendientes(idcliente);
            ICotes cotes;
            cotes = (ICotes) Naming.lookup("rmi://localhost/OperacionesCotes");
            Factura[] aux2 = cotes.pendientes(idcliente);
            Factura[] concate = new Factura[aux.length + aux2.length];
            System.arraycopy(aux, 0, concate, 0, aux.length);
            System.arraycopy(aux2, 0, concate, aux.length, aux2.length);
            return concate;

        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String pagar(Factura[] fact) throws RemoteException {
        try {
            int i = 0;
            for (Factura f : fact) {
                if (f.getEmpresa().getNombre().equals("Cessa")) {
                    i++;
                }
            }
            Factura[] facturaCessa = new Factura[i];
            Factura[] facturaCotes = new Factura[fact.length - i];

            i = 0;
            int j = 0;
            for (Factura f : fact) {
                if (f.getEmpresa().getNombre().equals("Cessa")) {
                    facturaCessa[i] = f;
                    i++;
                } else {
                    facturaCotes[j] = f;
                    j++;
                }
            }

            ICessa cessa;
            cessa = (ICessa) Naming.lookup("rmi://localhost/OperacionesCessa"); // instanciar un objeto remoto 
            cessa.pagar(facturaCessa);
            ICotes cotes;
            cotes = (ICotes) Naming.lookup("rmi://localhost/OperacionesCotes"); // instanciar un objeto remoto 
            cotes.pagar(facturaCotes);

            return "Pagado";
        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
