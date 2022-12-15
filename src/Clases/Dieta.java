/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Dieta {
   private String idDieta;
   private String idAnimal;//se conecta con animal

    public Dieta() {
    }

    public Dieta(String idDieta, String idAnimal) {
        this.idDieta = idDieta;
        this.idAnimal = idAnimal;
    }

    public String getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(String idDieta) {
        this.idDieta = idDieta;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", idAnimal=" + idAnimal + '}';
    }
   
}
