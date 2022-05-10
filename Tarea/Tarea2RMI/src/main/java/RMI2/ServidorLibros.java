/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ServidorLibros extends UnicastRemoteObject implements ILibro {

    public ServidorLibros() throws RemoteException {
        super();
    }

    ArrayList<Libro> libros = new ArrayList();
    int tope = 0;

    @Override
    public String crear(String titulo, String autor, String editorial, int anio) throws RemoteException {
        tope++;
        Libro aux = new Libro(tope, titulo, autor, editorial, anio);
        libros.add(aux);
        return "si";
    }

    @Override
    public Libro editar(int idLibro, String titulo, String autor, String editorial, int anio) throws RemoteException {
        if (idLibro > 0 && idLibro <= tope) {
            libros.get(idLibro - 1).setTitulo(titulo);
            libros.get(idLibro - 1).setAutor(autor);
            libros.get(idLibro - 1).setEditorial(editorial);
            libros.get(idLibro - 1).setAnio(anio);
            return libros.get(idLibro);
        }
        return null;
    }

    @Override
    public String eliminar(int idLibro) throws RemoteException {
        if (idLibro > 0 && idLibro <= tope) {
            libros.remove(libros.get(idLibro - 1));
            tope--;
            return "si";
        }
        return "no";
    }

    @Override
    public ArrayList<Libro> mostrar() throws RemoteException {
        return libros;
    }

}
