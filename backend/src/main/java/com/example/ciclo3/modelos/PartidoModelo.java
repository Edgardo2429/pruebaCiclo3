package com.example.ciclo3.modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partidos")
public class PartidoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    Date fecha;
    private int usuario;
    private int local;
    private int visitante;
    private int goles_local;
    private int goles_visitante;
    
    public int getUsuario() {
        return usuario;
    }
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    public int getLocal() {
        return local;
    }
    public void setLocal(int local) {
        this.local = local;
    }
    public int getVisitante() {
        return visitante;
    }
    public void setVisitante(int visitante) {
        this.visitante = visitante;
    }
    // public EquipoModelo getEquipoLoc() {
    //     return equipoLoc;
    // }
    // public void setEquipoLoc(EquipoModelo equipoLoc) {
    //     this.equipoLoc = equipoLoc;
    // }
    // public EquipoModelo getEquipoVis() {
    //     return equipoVis;
    // }
    // public void setEquipoVis(EquipoModelo equipoVis) {
    //     this.equipoVis = equipoVis;
    // }
    // public UsuarioModelo getUsu() {
    //     return usu;
    // }
    // public void setUsu(UsuarioModelo usu) {
    //     this.usu = usu;
    // }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
     
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getGoles_local() {
        return goles_local;
    }
    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }
    public int getGoles_visitante() {
        return goles_visitante;
    }
    public void setGoles_visitante(int goles_visitante) {
        this.goles_visitante = goles_visitante;
    }

     
}
