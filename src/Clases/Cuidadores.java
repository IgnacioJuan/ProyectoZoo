
package Clases;

public class Cuidadores extends Personal{
    private String idCuidador;
    private String especificacion;

    public Cuidadores() {
        super();
    }

    public Cuidadores(String idCuidador, String especificacion) {
        this.idCuidador = idCuidador;
        this.especificacion = especificacion;
    }

    public Cuidadores(String idCuidador, String especificacion, String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo);
        this.idCuidador = idCuidador;
        this.especificacion = especificacion;
    }

    public Cuidadores(String idCuidador, String especificacion, String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo, String Id_TipoUsuario, String Usuario, String Contraseña) {
        super(DNI, Nombre, Apellidos, edad, genero, direccion, cargo, areaTrabajo, Id_TipoUsuario, Usuario, Contraseña);
        this.idCuidador = idCuidador;
        this.especificacion = especificacion;
    }

  //Getter and setter

    public String getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(String idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "idCuidador=" + idCuidador + ", especificacion=" + especificacion + '}';
    }

  
    
}
