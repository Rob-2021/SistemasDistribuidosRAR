/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancormi;

import java.rmi.Remote;

/**
 *
 * @author MSI GAMING
 */
public interface IBanco extends Remote{
    public Boolean Retirar(CuentaBanco nrCuentaBanco, CuentaBanco monto);
    public Boolean Abonar(CuentaBanco nrCuentaBanco, CuentaBanco monto);
}
