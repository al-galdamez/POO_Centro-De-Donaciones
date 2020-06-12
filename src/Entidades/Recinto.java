 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;


public class Recinto 
{
    private String NombreRecinto;
    private String Direccion;
    private Personas PEncargado;
    private ArrayList<Personas>Lista_Recintos;
    
    public Recinto(String NombreR, String DireccionR, Personas Encargado, ArrayList<Personas> LRecintos)
    {
        this.setNombreRecinto(NombreR);
        this.setDireccion(DireccionR);
        this.setPEncargado(Encargado);
        this.setLista_Recintos(LRecintos);
    
    
    }

    public String getNombreRecinto() {
        return NombreRecinto;
    }

    public void setNombreRecinto(String NombreRecinto) {
        this.NombreRecinto = NombreRecinto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Personas getPEncargado() {
        return PEncargado;
    }

    public void setPEncargado(Personas PEncargado) {
        this.PEncargado = PEncargado;
    }

    public ArrayList<Personas> getLista_Recintos() {
        return Lista_Recintos;
    }

    public void setLista_Recintos(ArrayList<Personas> Lista_Recintos) {
        this.Lista_Recintos = Lista_Recintos;
    }
    
}
