package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.eventoRepositorio;
import com.helloworld.apispring.model.entity.eventos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class eventoServicio {
    
         @Autowired
    private eventoRepositorio Situaciones_Repositorio;

    public eventoServicio() {
    }

    public List<eventos> getSituaciones() {
        return Situaciones_Repositorio.getSituaciones();
    }
    
}
