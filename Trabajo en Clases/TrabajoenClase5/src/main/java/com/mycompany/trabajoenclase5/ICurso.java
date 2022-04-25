/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajoenclase5;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface ICurso extends Remote {
    public void RegistrarEstudiantes(Estudiante estudiante) throws RemoteException;
    public ArrayList<Estudiante>ListarEstudiantes() throws RemoteException;
}