package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.historiaRepositorio;
import com.helloworld.apispring.model.entity.historia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class historiaServicio {
    
     @Autowired
    private historiaRepositorio RegistroSituaciones_Repositorio;

    public historiaServicio() {
    }

    public List<historia> getRegistro() {
        return RegistroSituaciones_Repositorio.getRegistroSituaciones();
    }

    public long registroEvento(historia registroEvento) {
      return RegistroSituaciones_Repositorio.crearEvento(registroEvento);
      
    }
    
      List<historia> getEventosId(int id) {
        return (List<historia>) RegistroSituaciones_Repositorio.eventosIdCiudadano(id);
    }
   
    
}
