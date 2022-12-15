
package Clases;

public abstract class Usuario {
    //Atributos
    private String Id_TipoUsuario;
    private String Usuario;
    private String Contraseña;
    
    //Constructores

    public Usuario() {
    }
    
    public Usuario(String Id_TipoUsuario, String Usuario, String Contraseña) {
        this.Id_TipoUsuario = Id_TipoUsuario;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    //Setter and Getters

    public String getId_TipoUsuario() {
        return Id_TipoUsuario;
    }

    public void setId_TipoUsuario(String Id_TipoUsuario) {
        this.Id_TipoUsuario = Id_TipoUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Id_TipoUsuario=" + Id_TipoUsuario + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
}
