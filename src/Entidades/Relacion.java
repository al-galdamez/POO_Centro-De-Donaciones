/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Relacion 
{
    private Personas Donador;
    private Personas EncargadoD;
    private Recinto RecintoD;
    private Donativo DonativoD;
    private Personas TipoRecintos;
    
    public Relacion(Personas DonadorR, Personas EncargadoR, Recinto RecintoR, Donativo DonativoR, Personas RecintosT)
    {
        this.setDonador(DonadorR);
        this.setEncargadoD(EncargadoR);
        this.setRecintoD(RecintoR);
        this.setDonativoD(DonativoR);
        this.setTipoRecintos(RecintosT);
    
    
    }

    public Personas getDonador() {
        return Donador;
    }

    public void setDonador(Personas Donador) {
        this.Donador = Donador;
    }

    public Personas getEncargadoD() {
        return EncargadoD;
    }

    public void setEncargadoD(Personas EncargadoD) {
        this.EncargadoD = EncargadoD;
    }

    public Recinto getRecintoD() {
        return RecintoD;
    }

    public void setRecintoD(Recinto RecintoD) {
        this.RecintoD = RecintoD;
    }

    public Donativo getDonativoD() {
        return DonativoD;
    }

    public void setDonativoD(Donativo DonativoD) {
        this.DonativoD = DonativoD;
    }

    public Personas getTipoRecintos() {
        return TipoRecintos;
    }

    public void setTipoRecintos(Personas TipoRecintos) {
        this.TipoRecintos = TipoRecintos;
    }
    
}
