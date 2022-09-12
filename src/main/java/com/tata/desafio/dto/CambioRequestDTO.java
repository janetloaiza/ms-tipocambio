package com.tata.desafio.dto;

public class CambioRequestDTO {
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(Integer monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public Integer getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(Integer monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    private Double monto;
    private Integer monedaOrigen;
    private Integer monedaDestino;




}
