/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class CartillaMedica {
    private String idCartilla;
    private String idVeterinario;
    private String idReceta;
    private String idAnimal;
    private String nomEnfermedad;
    private String fecha;
    private String observaciones;

    public CartillaMedica() {
    }

    public CartillaMedica(String idCartilla, String idVeterinario, String idReceta, String idAnimal, String nomEnfermedad, String fecha, String observaciones) {
        this.idCartilla = idCartilla;
        this.idVeterinario = idVeterinario;
        this.idReceta = idReceta;
        this.idAnimal = idAnimal;
        this.nomEnfermedad = nomEnfermedad;
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public String getIdCartilla() {
        return idCartilla;
    }

    public void setIdCartilla(String idCartilla) {
        this.idCartilla = idCartilla;
    }

    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(String idReceta) {
        this.idReceta = idReceta;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomEnfermedad() {
        return nomEnfermedad;
    }

    public void setNomEnfermedad(String nomEnfermedad) {
        this.nomEnfermedad = nomEnfermedad;
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
        return "CartillaMedica{" + "idCartilla=" + idCartilla + ", idVeterinario=" + idVeterinario + ", idReceta=" + idReceta + ", idAnimal=" + idAnimal + ", nomEnfermedad=" + nomEnfermedad + ", fecha=" + fecha + ", observaciones=" + observaciones + '}';
    }
    
    
}
