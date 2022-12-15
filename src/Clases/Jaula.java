/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Jaula {
 private String idJaula;
 private String nombre;
 private String capacidad;

    public Jaula() {
    }

    public Jaula(String idJaula, String nombre, String capacidad) {
        this.idJaula = idJaula;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(String idJaula) {
        this.idJaula = idJaula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Jaula{" + "idJaula=" + idJaula + ", nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
 
}
