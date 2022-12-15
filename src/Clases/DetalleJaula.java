/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class DetalleJaula {
    private String idAnimal;
    private String idJaula;
    private String observaciones;

    public DetalleJaula() {
    }

    public DetalleJaula(String idAnimal, String idJaula, String observaciones) {
        this.idAnimal = idAnimal;
        this.idJaula = idJaula;
        this.observaciones = observaciones;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(String idJaula) {
        this.idJaula = idJaula;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "DetalleJaula{" + "idAnimal=" + idAnimal + ", idJaula=" + idJaula + ", observaciones=" + observaciones + '}';
    }
    
}
