/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioparcial;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Usuario
 */
public interface IUniversidad extends Remote{
    public Diploma EmitirDiploma(CI,Nombres, 1erApellido, 2doApellido,fecha_nacimiento, Carrera) throws RemoteException;
}
