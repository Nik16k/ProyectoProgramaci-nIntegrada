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

   
     List<personas> getCiudadanoPorId(String apellido) {
        return (List<personas>) Ciudadano_Repositorio.ciudadnosPorId(apellido);
    }
   
}
