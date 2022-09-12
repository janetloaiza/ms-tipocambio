package com.tata.desafio.repository;

import com.tata.desafio.model.Moneda;
import com.tata.desafio.model.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TipoCambioRepository  extends JpaRepository<TipoCambio, Long> {
    @Query("SELECT e FROM TipoCambio e WHERE e.origen = ?1 and e.destino = ?2")
    TipoCambio findTipoCambioById(String origen,String destino );

}
