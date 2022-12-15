
package Clases;

public class Admin extends Usuario{
    private String Id_Administrador;

    public Admin() {
        super();
    }

    public Admin(String Id_Administrador) {
        this.Id_Administrador = Id_Administrador;
    }

    public Admin(String Id_Administrador, String Id_TipoUsuario, String Usuario, String Contraseña) {
        super(Id_TipoUsuario, Usuario, Contraseña);
        this.Id_Administrador = Id_Administrador;
    }

    public String getId_Administrador() {
        return Id_Administrador;
    }

    public void setId_Administrador(String Id_Administrador) {
        this.Id_Administrador = Id_Administrador;
    }

    @Override
    public String toString() {
        return super.toString()+ "Admin{" + "Id_Administrador=" + Id_Administrador + '}';
    }
    
    
}

   