/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class DetalleLimpieza {
   private String idLimpieza;
   private String idArea;
   private String fecha;
   private String observaciones;

    public DetalleLimpieza() {
    }

    public DetalleLimpieza(String idLimpieza, String idArea, String fecha, String observaciones) {
        this.idLimpieza = idLimpieza;
        this.idArea = idArea;
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public String getIdLimpieza() {
        return idLimpieza;
    }

    public void setIdLimpieza(String idLimpieza) {
        this.idLimpieza = idLimpieza;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "DetalleLimpieza{" + "idLimpieza=" + idLimpieza + ", idArea=" + idArea + ", fecha=" + fecha + ", observaciones=" + observaciones + '}';
    }
   
}
