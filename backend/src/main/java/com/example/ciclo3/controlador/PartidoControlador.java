package com.example.ciclo3.controlador;

import java.util.ArrayList;

import com.example.ciclo3.modelos.PartidoModelo;
import com.example.ciclo3.servicios.PartidoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/partidos")
public class PartidoControlador {
    @Autowired
    PartidoServicio partidoServicio;

    @GetMapping("/ver")
    public ArrayList<PartidoModelo> verPartidos(){
        return partidoServicio.verPartidos();
    }
    
    @PostMapping("/guardar")
    public PartidoModelo guardarPartido(@RequestBody PartidoModelo partido){
        return partidoServicio.guardarPartido(partido);
    }
    
}
