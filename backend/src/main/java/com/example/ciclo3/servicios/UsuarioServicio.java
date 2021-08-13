package com.example.ciclo3.servicios;

import java.util.ArrayList;

import com.example.ciclo3.modelos.UsuarioModelo;
import com.example.ciclo3.repositorio.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepo usuarioRepo;

    public ArrayList<UsuarioModelo> verUsuarios(){
        return (ArrayList<UsuarioModelo>) usuarioRepo.findAll();
    }

    public UsuarioModelo guardarUsuario(UsuarioModelo usuario)
    {
        return usuarioRepo.save(usuario);
    }
    
}
