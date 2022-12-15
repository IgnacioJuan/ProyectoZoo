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
public class DetalleDieta extends Dieta{
     private Integer cantidad; 
     private String idProducto; //sec onceta con producto

    public DetalleDieta() {
        super();
    }

    public DetalleDieta(Integer cantidad, String idProducto) {
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }

    public DetalleDieta(String idDieta, String idAnimal,Integer cantidad, String idProducto) {
        super(idDieta, idAnimal);
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return super.toString()+"DetalleDieta{" + "cantidad=" + cantidad + ", idProducto=" + idProducto + '}';
    }

    

}