package com.tata.desafio.repository;

import com.tata.desafio.model.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {
}
