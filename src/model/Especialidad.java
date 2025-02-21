package model;

import java.time.LocalDate;

public class Especialidad {
    private Integer idespe;
    private String nomespe;
    private Boolean estado;
    private LocalDate fechaCrea;

    public Especialidad(Integer idespe, String nomespe, Boolean estado, LocalDate fechaCrea) {
        this.idespe = idespe;
        this.nomespe = nomespe;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
    }

    public Integer getIdespe() {
        return idespe;
    }

    public void setIdespe(Integer idespe) {
        this.idespe = idespe;
    }

    public String getNomespe() {
        return nomespe;
    }

    public void setNomespe(String nomespe) {
        this.nomespe = nomespe;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public void Imprmir(){
        System.out.println("ID: "+idespe);
        System.out.println("Nombre: "+nomespe);
        System.out.println("Estado: "+true);
        System.out.println("Fecha de creacion: "+fechaCrea);
    }
}
