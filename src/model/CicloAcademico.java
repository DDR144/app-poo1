package model;

import java.time.LocalDate;

public class CicloAcademico {
    private Integer idCiclo;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String nomCiclo;
    private String descCiclo;

    public Integer getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNomCiclo() {
        return nomCiclo;
    }

    public void setNomCiclo(String nomCiclo) {
        this.nomCiclo = nomCiclo;
    }

    public String getDescCiclo() {
        return descCiclo;
    }

    public void setDescCiclo(String descCiclo) {
        this.descCiclo = descCiclo;
    }
}
