
package Clases;

public class Area {
    private String idArea;
    private String nombre;
    private String tamañokm;
    private String idHabitad;

    public Area() {
    }

    public Area(String idArea, String nombre, String tamañokm, String idHabitad) {
        this.idArea = idArea;
        this.nombre = nombre;
        this.tamañokm = tamañokm;
        this.idHabitad = idHabitad;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamañokm() {
        return tamañokm;
    }

    public void setTamañokm(String tamañokm) {
        this.tamañokm = tamañokm;
    }

    public String getIdHabitad() {
        return idHabitad;
    }

    public void setIdHabitad(String idHabitad) {
        this.idHabitad = idHabitad;
    }

    @Override
    public String toString() {
        return "Area{" + "idArea=" + idArea + ", nombre=" + nombre + ", tama\u00f1okm=" + tamañokm + ", idHabitad=" + idHabitad + '}';
    }

    
   
    
}
