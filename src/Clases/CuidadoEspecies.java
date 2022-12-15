/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class CuidadoEspecies {
    private String idCuidador;
    private String IdEspecie;
    private String fechaEmision;

    public CuidadoEspecies() {
    }

    public CuidadoEspecies(String idCuidador, String IdEspecie, String fechaEmision) {
        this.idCuidador = idCuidador;
        this.IdEspecie = IdEspecie;
        this.fechaEmision = fechaEmision;
    }

    public String getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(String idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getIdEspecie() {
        return IdEspecie;
    }

    public void setIdEspecie(String IdEspecie) {
        this.IdEspecie = IdEspecie;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @Override
    public String toString() {
        return "CuidadoEspecies{" + "idCuidador=" + idCuidador + ", IdEspecie=" + IdEspecie + ", fechaEmision=" + fechaEmision + '}';
    }
    
    
}
