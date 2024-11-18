package com.idat.capacitaciones.repository;

import com.idat.capacitaciones.model.Capacitaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CapacitacionesRepository extends JpaRepository<Capacitaciones, Integer> {
}
