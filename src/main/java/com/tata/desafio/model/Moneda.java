package com.tata.desafio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="moneda")
public class Moneda implements Serializable {
    @Id

    private long id;
    private String nombre;
    private String simbolo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
