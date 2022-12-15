/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class PersonalLimpieza extends Personal{
    private String idLimpieza;
    private int diasLabor;

    public PersonalLimpieza() {
        super();
    }

    public PersonalLimpieza(String idLimpieza, int diasLabor) {
        this.idLimpieza = idLimpieza;
        this.diasLabor = diasLabor;
    }

    public PersonalLimpieza(String idLimpieza,String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo, int diasLabor) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo);
        this.idLimpieza = idLimpieza;
        this.diasLabor = diasLabor;
    }

    public String getIdLimpieza() {
        return idLimpieza;
    }

    public void setIdLimpieza(String idLimpieza) {
        this.idLimpieza = idLimpieza;
    }

    public int getDiasLabor() {
        return diasLabor;
    }

    public void setDiasLabor(int diasLabor) {
        this.diasLabor = diasLabor;
    }

    @Override
    public String toString() {
        return super.toString()+ "idLimpieza=" + idLimpieza + ", diasLabor=" + diasLabor;
    }
    
    
}
