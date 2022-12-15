/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Guardia extends Personal{
    //Atributos
    private String id_Guardia;
    private String Jornada;
    
    //Constructores

    public Guardia() {
        super();
    }

    public Guardia(String id_Guardia, String Jornada) {
        this.id_Guardia = id_Guardia;
        this.Jornada = Jornada;
    }

    public Guardia(String id_Guardia, String Jornada, String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo);
        this.id_Guardia = id_Guardia;
        this.Jornada = Jornada;
    }

    public Guardia(String id_Guardia, String Jornada, String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo, String Id_TipoUsuario, String Usuario, String Contraseña) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo, Id_TipoUsuario, Usuario, Contraseña);
        this.id_Guardia = id_Guardia;
        this.Jornada = Jornada;
    }
    
    //Getter and setter

    public String getId_Guardia() {
        return id_Guardia;
    }

    public void setId_Guardia(String id_Guardia) {
        this.id_Guardia = id_Guardia;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }
    
    //ToString

    @Override
    public String toString() {
        return super.toString()+"Guardia{" + "id_Guardia=" + id_Guardia + ", Jornada=" + Jornada + '}';
    }
    
}   
