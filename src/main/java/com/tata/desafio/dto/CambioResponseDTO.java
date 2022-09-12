package com.tata.desafio.dto;

public class CambioResponseDTO {
    private Double monto;

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMontoCambio() {
        return montoCambio;
    }

    public void setMontoCambio(Double montoCambio) {
        this.montoCambio = montoCambio;
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

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    private Double montoCambio;
    private Integer monedaOrigen;
    private Integer monedaDestino;
    private Double tipoCambio;




}
