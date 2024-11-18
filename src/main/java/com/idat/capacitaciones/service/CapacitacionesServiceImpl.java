package com.idat.capacitaciones.service;

import com.idat.capacitaciones.model.Capacitaciones;
import com.idat.capacitaciones.repository.CapacitacionesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CapacitacionesServiceImpl implements CapacitacionesService {

    private final CapacitacionesRepository capacitacionesRepository;

    @Override
    public List<Capacitaciones> listarCapacitaciones() {
        return capacitacionesRepository.findAll();
    }

    @Override
    public void guardarCapacitaciones(Capacitaciones capacitaciones) { capacitacionesRepository.save(capacitaciones);

    }

    @Override
    public Capacitaciones obtenerCapacitacionesPorId(Integer id) {
        return capacitacionesRepository.findById(id).orElseThrow(() -> new RuntimeException("Capacitacion no encontrada para el id: " + id));
    }

    @Override
    public void eliminarCapacitaciones(Integer id) {
        if (capacitacionesRepository.existsById(id)) {
            capacitacionesRepository.deleteById(id);

        } else {
            throw new RuntimeException("Capacitacion no encontrada para el id: " + id);
        }

    }
}
