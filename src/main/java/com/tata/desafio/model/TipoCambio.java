package com.tata.desafio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tipo_cambio")
public class TipoCambio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String origen;
    private String destino;
    private Double cambio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }


    @Override
    public String toString() {
        return "TipoCambio{" +
                "id=" + id +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", cambio=" + cambio +
                '}';
    }
}
