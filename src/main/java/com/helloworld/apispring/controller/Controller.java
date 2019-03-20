package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.entity.personas;
import com.helloworld.apispring.model.entity.historia;
import com.helloworld.apispring.model.entity.eventos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/v1")
public class Controller {
    
    @Autowired
    private personaServicio personaServicio;
    @Autowired
    private historiaServicio historiaServicio;
    
    @RequestMapping(value = "/PersonasConsultar", method = RequestMethod.GET)
    public ResponseEntity<List<personas>> obtenerCiudadanos() {
        List<personas> ciudadanos = personaServicio.getCiudadanos();
        return new ResponseEntity<List<personas>>(ciudadanos, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/PersonasInsertar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearPersona(@RequestBody personas Ciudadano) {
        String resultado = "Se creo persona con ID: " + personaServicio.crearPersona(Ciudadano);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
    
    @Autowired
    private eventoServicio eventoServicio;
    
    @RequestMapping(value = "/eventosConsultar", method = RequestMethod.GET)
    public ResponseEntity<List<eventos>> obtenerEventos() {
        List<eventos> situaciones = eventoServicio.getSituaciones();
        return new ResponseEntity<List<eventos>>(situaciones, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/personaBuscar", method = RequestMethod.GET)
    public ResponseEntity<List<personas>> PersonaID(@RequestParam(value = "IdCiudadano") int IdCiudadano) {
        List<personas> ciudadnosId = (List<personas>) personaServicio.getCiudadanoPorId(IdCiudadano);
        return new ResponseEntity<List<personas>>(ciudadnosId, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<List<personas>> login(@RequestParam(value = "USUARIO") String USUARIO, @RequestParam(value = "CONTRASENNA") String CONTRASENNA) {
        List<personas> personasID = (List<personas>) personaServicio.getLogin(USUARIO, CONTRASENNA);
        return new ResponseEntity<List<personas>>(personasID, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/EventosInsertar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearEventoPersona(@RequestBody historia registroEvento) {
        String resultado = "Se creo el evento : " + historiaServicio.registroEvento(registroEvento);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    //Revisar
    @RequestMapping(value = "/eventos_persona", method = RequestMethod.GET)
    public ResponseEntity<List<historia>> eventosCiudadanoPorId(@RequestParam(value = "IdCiudadano") int id) {
        List<historia> eventosCiudadanosId = (List<historia>) historiaServicio.getEventosId(id);        
        return new ResponseEntity<>(eventosCiudadanosId, HttpStatus.OK);
    }    
}
