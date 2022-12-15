/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class CarnetVacuna {
private String idCarnet;
private  String idAnimal;
private String vacuna;
private String fechaEmision;

    public CarnetVacuna() {
    }

    public CarnetVacuna(String idCarnet, String idAnimal, String vacuna, String fechaEmision) {
        this.idCarnet = idCarnet;
        this.idAnimal = idAnimal;
        this.vacuna = vacuna;
        this.fechaEmision = fechaEmision;
    }

    public String getIdCarnet() {
        return idCarnet;
    }

    public void setIdCarnet(String idCarnet) {
        this.idCarnet = idCarnet;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @Override
    public String toString() {
        return "CarnetVacuna{" + "idCarnet=" + idCarnet + ", idAnimal=" + idAnimal + ", vacuna=" + vacuna + ", fechaEmision=" + fechaEmision + '}';
    }


}

