package com.helloworld.apispring.model.entity;

import com.helloworld.apispring.model.entity.personas;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "registrosituaciones")
public class historia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRegistroSituaciones")
    private Integer idRegistroSituaciones;
    
    @ManyToOne
    @JoinColumn(name = "IdCiudadano", referencedColumnName = "IdCiudadano")
    private personas Ciudadano;
    
    @ManyToOne
    @JoinColumn(name = "IdSituacion", referencedColumnName = "IdSituacion")
    private eventos idSituacion;

    public historia() {
    }

    public historia(Integer idRegistroSituaciones) {
        this.idRegistroSituaciones = idRegistroSituaciones;
    }

    public Integer getIdRegistroSituaciones() {
        return idRegistroSituaciones;
    }

    public void setIdRegistroSituaciones(Integer idRegistroSituaciones) {
        this.idRegistroSituaciones = idRegistroSituaciones;
    }

    public personas getIdCiudadano() {
        return Ciudadano;
    }

    public void setIdCiudadano(personas idCiudadano) {
        this.Ciudadano = idCiudadano;
    }

    public eventos getIdSituacion() {
        return idSituacion;
    }

    public void setIdSituacion(eventos idSituacion) {
        this.idSituacion = idSituacion;
    }

}
