package com.example.ciclo3.repositorio;

import com.example.ciclo3.modelos.EquipoModelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepo extends CrudRepository<EquipoModelo,Long>{
    
}
