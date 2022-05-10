/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI2;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface ILibro extends Remote{

    public String crear(String titulo, String autor, String editorial, int anio) throws RemoteException;

    public Libro editar(int idLibro, String titulo, String autor, String editorial, int anio) throws RemoteException;

    public String eliminar(int idLibro) throws RemoteException;

    public ArrayList<Libro> mostrar() throws RemoteException;
}
