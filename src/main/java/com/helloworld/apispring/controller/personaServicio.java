package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.personaRepositorio;
import com.helloworld.apispring.model.entity.personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaServicio {

    @Autowired
    private personaRepositorio Ciudadano_Repositorio;

    public personaServicio() {
    }


    public List<personas> getCiudadanos() {
        return Ciudadano_Repositorio.getPersonas();
    }

    public long crearPersona(personas Ciudadano) {
        return Ciudadano_Repositorio.crearPersona(Ciudadano);
    }

   
     List<personas> getCiudadanoPorId(int IdCiudadano) {
        return (List<personas>) Ciudadano_Repositorio.personaPorID(IdCiudadano);
    }
     
         List<personas> getLogin(String usuario, String contrAseña) {
        return (List<personas>) Ciudadano_Repositorio.login(usuario, contrAseña);
    }
   
}
