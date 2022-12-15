
package Clases;

public class Personal extends Usuario{
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private int edad;
    private String genero;
    private String direccion;
    private String cargo;
    private String areaTrabajo;

    public Personal() {
        super();
    }

    public Personal(String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.cargo = cargo;
        this.areaTrabajo = areaTrabajo;
    }

    public Personal(String DNI, String Nombre, String Apellidos, int edad, String genero, String direccion, String cargo, String areaTrabajo, String Id_TipoUsuario, String Usuario, String Contraseña) {
        super(Id_TipoUsuario, Usuario, Contraseña);
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.cargo = cargo;
        this.areaTrabajo = areaTrabajo;
    }

    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    @Override
    public String toString() {
        return super.toString()+"Personal{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", edad=" + edad + ", genero=" + genero + ", direccion=" + direccion + ", cargo=" + cargo + ", areaTrabajo=" + areaTrabajo + '}';
    }
    
}
