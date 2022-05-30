/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgroup;

/**
 *
 * @author Usuario
 */
public class VotosMesa {
    private int votosMaria;
    private int votosJuan;
    private int votosPedro;

    public VotosMesa(int votosMaria, int votosJuan, int votosPedro) {
        this.votosMaria = votosMaria;
        this.votosJuan = votosJuan;
        this.votosPedro = votosPedro;
    }

    public int getVotosMaria() {
        return votosMaria;
    }

    public void setVotosMaria(int votosMaria) {
        this.votosMaria = votosMaria;
    }

    public int getVotosJuan() {
        return votosJuan;
    }

    public void setVotosJuan(int votosJuan) {
        this.votosJuan = votosJuan;
    }

    public int getVotosPedro() {
        return votosPedro;
    }

    public void setVotosPedro(int votosPedro) {
        this.votosPedro = votosPedro;
    }

    @Override
    public String toString() {
        return "VotosMesa{" + "votosMaria=" + votosMaria + ", votosJuan=" + votosJuan + ", votosPedro=" + votosPedro + '}';
    }
    
    
}
