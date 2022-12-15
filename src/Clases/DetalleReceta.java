/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author The Prince
 */
public class DetalleReceta {
    private String idReceta;
    private String IdProducto;
    private String cantidad;
    private String observaciones;

    public DetalleReceta() {
    }

    public DetalleReceta(String idReceta, String IdProducto, String cantidad, String observaciones) {
        this.idReceta = idReceta;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }

    public String getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(String idReceta) {
        this.idReceta = idReceta;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "DetalleReceta{" + "idReceta=" + idReceta + ", IdProducto=" + IdProducto + ", cantidad=" + cantidad + ", observaciones=" + observaciones + '}';
    }
    
}
