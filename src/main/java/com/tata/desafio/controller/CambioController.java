package com.tata.desafio.controller;

import com.tata.desafio.dto.CambioRequestDTO;
import com.tata.desafio.dto.CambioResponseDTO;
import com.tata.desafio.model.Moneda;
import com.tata.desafio.model.TipoCambio;
import com.tata.desafio.repository.MonedaRepository;
import com.tata.desafio.repository.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cambio")


public class CambioController {

    @Autowired
    private MonedaRepository monedaRepository;

    @GetMapping("/listarMoneda")
    public List<Moneda> getAllMoneda()
    {

        return monedaRepository.findAll();
    }

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    @GetMapping("/listarTipoCambio")
    public List<TipoCambio> getAllTipoCambio()
    {
            return tipoCambioRepository.findAll();
    }

    @PostMapping("/monto")
    public CambioResponseDTO cambioResponseDTO(@RequestBody CambioRequestDTO cambioRequestDTO)

    {

        TipoCambio tipoCambio=tipoCambioRepository.findTipoCambioById(cambioRequestDTO.getMonedaOrigen().toString()
        , cambioRequestDTO.getMonedaDestino().toString());

        int operacion=1;

        if (tipoCambio==null){
            operacion=2;

            tipoCambio=tipoCambioRepository.findTipoCambioById(cambioRequestDTO.getMonedaDestino().toString()
                    , cambioRequestDTO.getMonedaOrigen().toString());
        }
        CambioResponseDTO cambioResponseDTO=new CambioResponseDTO();

        cambioResponseDTO.setMonto(cambioRequestDTO.getMonto());
        cambioResponseDTO.setMonedaOrigen(cambioRequestDTO.getMonedaOrigen());
        cambioResponseDTO.setMonedaDestino(cambioRequestDTO.getMonedaDestino());
        cambioResponseDTO.setTipoCambio(tipoCambio.getCambio());

        if(tipoCambio != null){

            if (operacion==1){
                cambioResponseDTO.setMontoCambio(cambioRequestDTO.getMonto()*tipoCambio.getCambio());
            }
            else {
                cambioResponseDTO.setMontoCambio(cambioRequestDTO.getMonto()/tipoCambio.getCambio());
            }
        }
        return cambioResponseDTO;
    }

}
