
package Clases;

public class Habitad {
private String idHabitad;
private String idEspecie; ////concetamos con especies
private String clima;
private String descripcion;

    public Habitad() {
    }

    public Habitad(String idHabitad, String idEspecie, String clima, String descripcion) {
        this.idHabitad = idHabitad;
        this.idEspecie = idEspecie;
        this.clima = clima;
        this.descripcion = descripcion;
    }

    public String getIdHabitad() {
        return idHabitad;
    }

    public void setIdHabitad(String idHabitad) {
        this.idHabitad = idHabitad;
    }

    public String getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(String idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Habitad{" + "idHabitad=" + idHabitad + ", idEspecie=" + idEspecie + ", clima=" + clima + ", descripcion=" + descripcion + '}';
    }

}
