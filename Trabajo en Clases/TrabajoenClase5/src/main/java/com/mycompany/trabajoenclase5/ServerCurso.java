/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajoenclase5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ServerCurso extends UnicastRemoteObject implements ICurso{
    String materia;
    String docente;
    ArrayList<Estudiante> listaAlumnos;

    public ServerCurso(String materia, String docente) throws RemoteException {
        super();
        this.listaAlumnos=new ArrayList<Estudiante>();
    }

    @Override
    public void RegistrarEstudiantes(Estudiante estudiante) throws RemoteException {
        this.listaAlumnos.add(estudiante);
    }

    @Override
    public ArrayList<Estudiante> ListarEstudiantes() throws RemoteException {
        return this.listaAlumnos;
    }
    
}
