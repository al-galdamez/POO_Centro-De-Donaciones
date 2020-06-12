/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Personas 
{
    private String Personas;
    private String Apellido;
    private String DUI;
    
    public Personas(String PersonasP, String ApellidoP, String DUIP)
    {
        this.setPersonas(PersonasP);
        this.setApellido(ApellidoP);
        this.setDUI(DUIP);
        
    
    
    }

    public String getPersonas() {
        return Personas;
    }

    public void setPersonas(String Personas) {
        this.Personas = Personas;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    
}
