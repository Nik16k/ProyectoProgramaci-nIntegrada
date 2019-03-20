package com.helloworld.apispring.model.entity;

import com.helloworld.apispring.model.entity.historia;
import com.helloworld.apispring.model.entity.personas;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadanos")

public class personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCiudadano")
    private Integer IdCiudadano;
    @Column(name = "NombresCiudadano")
    private String NombresCiudadano;
    @Column(name = "ApellidosCiudadano")
    private String ApellidosCiudadano;
    @Column(name = "CONTRASENNA")
    private String CONTRASENNA;
    @Column(name = "USUARIO")
    private String USUARIO;
    @OneToMany(mappedBy = "Ciudadano")
    private List<historia> registrosituaciones;

    public Integer getIdCiudadano() {
        return IdCiudadano;
    }

    public void setIdCiudadano(Integer idCiudadano) {
        this.IdCiudadano = idCiudadano;
    }

    public String getNombresCiudadano() {
        return NombresCiudadano;
    }

    public void setNombresCiudadano(String nombresCiudadano) {
        this.NombresCiudadano = nombresCiudadano;
    }

    public String getApellidosCiudadano() {
        return ApellidosCiudadano;
    }

    public void setApellidosCiudadano(String apellidosCiudadano) {
        this.ApellidosCiudadano = apellidosCiudadano;
    }

    public String getContrasenna() {
        return CONTRASENNA;
    }

    public void setContrasenna(String contrasenna) {
        this.CONTRASENNA = contrasenna;
    }

    public String getUsuario() {
        return USUARIO;
    }

    public void setUsuario(String usuario) {
        this.USUARIO = usuario;
    }

    

}
