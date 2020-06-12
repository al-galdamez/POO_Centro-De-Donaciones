/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 *
 */
public class Donativo 
{
    private String CodigoValidez;
    private Date FechaH;
    private double Cantidad;
    
    public Donativo (String CodigoV, Date Fecha, double Cant)
    {
        this.setCodigoValidez(CodigoV);
        this.setFechaH(Fecha);
        this.setCantidad(Cant);
    
    
    }

    public String getCodigoValidez() {
        return CodigoValidez;
    }

    public void setCodigoValidez(String CodigoValidez) {
        this.CodigoValidez = CodigoValidez;
    }

    public Date getFechaH() {
        return FechaH;
    }

    public void setFechaH(Date FechaH) {
        this.FechaH = FechaH;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
