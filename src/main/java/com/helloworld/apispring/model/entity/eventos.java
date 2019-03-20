package com.helloworld.apispring.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "situaciones")

public class eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSituacion")
    private Integer idSituacion;
    @Column(name = "NombreSituacion")
    private String nombreSituacion;
    @Column(name = "DescripcionSituacion")
    private String descripcionSituacion;
    @Column(name = "PuntajeSituacion")
    private Integer puntajeSituacion;
    @OneToMany(mappedBy = "idSituacion")
    private List<historia> registrosituaciones;
    public eventos() {
    }

    public eventos(Integer idSituacion) {
        this.idSituacion = idSituacion;
    }

    public Integer getIdSituacion() {
        return idSituacion;
    }

    public void setIdSituacion(Integer idSituacion) {
        this.idSituacion = idSituacion;
    }

    public String getNombreSituacion() {
        return nombreSituacion;
    }

    public void setNombreSituacion(String nombreSituacion) {
        this.nombreSituacion = nombreSituacion;
    }

    public String getDescripcionSituacion() {
        return descripcionSituacion;
    }

    public void setDescripcionSituacion(String descripcionSituacion) {
        this.descripcionSituacion = descripcionSituacion;
    }

    public Integer getPuntajeSituacion() {
        return puntajeSituacion;
    }

    public void setPuntajeSituacion(Integer puntajeSituacion) {
        this.puntajeSituacion = puntajeSituacion;
    }

}
