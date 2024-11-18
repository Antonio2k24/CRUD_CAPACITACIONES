package com.idat.capacitaciones.service;

import com.idat.capacitaciones.model.Capacitaciones;

import java.util.List;

public interface CapacitacionesService {

    List<Capacitaciones> listarCapacitaciones();
    void guardarCapacitaciones(Capacitaciones capacitaciones);
    Capacitaciones obtenerCapacitacionesPorId(Integer id);
    void eliminarCapacitaciones(Integer id);
}
