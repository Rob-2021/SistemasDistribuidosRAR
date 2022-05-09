/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1amachuy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class ServidorCotes extends UnicastRemoteObject implements ICotes {

    public ServidorCotes() throws RemoteException {
        super();
    }

    @Override
    public Factura[] pendientes(int idcliente) throws RemoteException {
        Empresa cotes = new Empresa("Cotes",234423423L);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(idcliente)
        {
            case 1:
                Factura[] aux=new Factura[3];
                aux[0]=new Factura(cotes, 114, Mes.diciembre, 2021, 170);
                aux[1]=new Factura(cotes, 321, Mes.enero, 2022, 100);
                aux[2]=new Factura(cotes, 22454, Mes.febrero, 2022, 150);
                return aux;
            case 2:
                Factura[] aux2=new Factura[2];
                aux2[0] = new Factura(cotes,225, Mes.enero, 2022, 150);
                aux2[1] = new Factura(cotes,1125, Mes.febrero, 2022, 200);
                
                return aux2;
             default: System.out.println("Usuario no existente");
        }
       
        return null;
        
    }

    @Override
    public void pagar(Factura[] fact) throws RemoteException {
        System.out.println("Se pago las facturas");
        for(Factura f: fact){
            System.out.println(f);
        }
    }
    
}
