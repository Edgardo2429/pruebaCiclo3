package com.example.ciclo3.servicios;

import java.util.ArrayList;

import com.example.ciclo3.modelos.PartidoModelo;
import com.example.ciclo3.repositorio.PartidoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoServicio {

    @Autowired
    PartidoRepo partidoRepo;

    public ArrayList<PartidoModelo> verPartidos(){
        return (ArrayList<PartidoModelo>) partidoRepo.findAll();
    }
    public PartidoModelo guardarPartido(PartidoModelo partido){
        return partidoRepo.save(partido);
    }
    
}
