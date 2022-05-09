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
public class ServidorCessa extends UnicastRemoteObject implements ICessa {

    public ServidorCessa() throws RemoteException {
        super();
    }

    @Override
    public Factura[] pendientes(int idcliente) throws RemoteException {
        Empresa cessa = new Empresa("Cessa",2222222L);
        
        switch(idcliente)
        {
            case 1:
                Factura[] aux=new Factura[2];
                aux[0]=new Factura(cessa, 1, Mes.diciembre, 2021, 150);
                aux[1]=new Factura(cessa, 1, Mes.enero, 2022, 701);
                return aux;
            case 2:
                Factura[] aux2=new Factura[2];
                aux2[0] = new Factura(cessa,2, Mes.enero, 2022, 610);
                aux2[1] = new Factura(cessa,2, Mes.febrero, 2022, 801);
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
