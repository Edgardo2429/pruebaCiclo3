package com.example.ciclo3.repositorio;

import org.springframework.stereotype.Repository;
import com.example.ciclo3.modelos.PartidoModelo;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PartidoRepo extends CrudRepository<PartidoModelo,Long>{
    
}
