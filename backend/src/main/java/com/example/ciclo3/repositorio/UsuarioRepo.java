package com.example.ciclo3.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ciclo3.modelos.UsuarioModelo;

@Repository
public interface UsuarioRepo extends CrudRepository<UsuarioModelo,Long> {
    
}
