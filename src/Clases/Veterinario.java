/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Veterinario extends Personal{
    private String idVeterinario;
    private String  especialidad;

    public Veterinario() {
        super();
    }

    public Veterinario(String idVeterinario, String especialidad) {
        this.idVeterinario = idVeterinario;
        this.especialidad = especialidad;
    }

    public Veterinario(String idVeterinario, String especialidad, String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo);
        this.idVeterinario = idVeterinario;
        this.especialidad = especialidad;
    }

    public Veterinario(String idVeterinario, String especialidad, String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo, String Id_TipoUsuario, String Usuario, String Contraseña) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo, Id_TipoUsuario, Usuario, Contraseña);
        this.idVeterinario = idVeterinario;
        this.especialidad = especialidad;
    }
    //Getter and Setter
    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

 
    @Override
    public String toString() {
        return super.toString()+ "idVeterinario=" + idVeterinario + ", especialidad=" + especialidad ;
    }
   
    
    
}
