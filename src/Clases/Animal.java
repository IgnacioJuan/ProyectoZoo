/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Animal {
    
    private String idAnimal;
    private String nombre_cienti;
    private String nombre_vulga;
    private String peso;
    private String edad;
    private String origen;
    private String sexo;
    private Date fecha_ingreso;
    private Date fecha_nacimiento;
    private String descripcion;

    public Animal() {
    }

    public Animal(String idAnimal, String nombre_cienti, String nombre_vulga, String peso, String edad, String origen, String sexo, Date fecha_ingreso, Date fecha_nacimiento, String descripcion) {
        this.idAnimal = idAnimal;
        this.nombre_cienti = nombre_cienti;
        this.nombre_vulga = nombre_vulga;
        this.peso = peso;
        this.edad = edad;
        this.origen = origen;
        this.sexo = sexo;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
        this.descripcion = descripcion;
    }

    

    
    
    

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre_cienti() {
        return nombre_cienti;
    }

    public void setNombre_cienti(String nombre_cienti) {
        this.nombre_cienti = nombre_cienti;
    }

    public String getNombre_vulga() {
        return nombre_vulga;
    }

    public void setNombre_vulga(String nombre_vulga) {
        this.nombre_vulga = nombre_vulga;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", nombre_cienti=" + nombre_cienti + ", nombre_vulga=" + nombre_vulga + ", peso=" + peso + ", edad=" + edad + ", origen=" + origen + ", sexo=" + sexo  + ", fecha_ingreso=" + fecha_ingreso + ", fecha_nacimiento=" + fecha_nacimiento + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
