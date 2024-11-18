package com.idat.capacitaciones.controller;

import com.idat.capacitaciones.model.Capacitaciones;
import com.idat.capacitaciones.service.CapacitacionesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/capacitaciones")
@AllArgsConstructor
public class CapacitacionesController {

    private final CapacitacionesService capacitacionesService;

    @GetMapping("/listarCapacitaciones")
    public String verPaginaInicio(Model model) {
        model.addAttribute("listaCapacitaciones", capacitacionesService.listarCapacitaciones());
        return "capacitaciones/capacitaciones";
    }

    @GetMapping("/nuevaCapacitaciones")
    public String nuevaCapacitaciones(Model model) {
        model.addAttribute("capacitaciones", new Capacitaciones());
        return "capacitaciones/nuevaCapacitaciones";
    }

    @PostMapping("/guardarCapacitaciones")
    public String guardarCapacitaciones(@ModelAttribute("capacitaciones") Capacitaciones capacitaciones) {
        capacitacionesService.guardarCapacitaciones(capacitaciones);
        return "redirect:/capacitaciones/listarCapacitaciones";
    }

    @GetMapping("/actualizarCapacitaciones/{id}")
    public String actualizarCapacitaciones(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("capacitaciones", capacitacionesService.obtenerCapacitacionesPorId(id));
        return "capacitaciones/actualizarCapacitaciones";
    }

    @GetMapping("/eliminarCapacitaciones/{id}")
    public String eliminarCapacitaciones(@PathVariable("id") Integer id) {
        capacitacionesService.eliminarCapacitaciones(id);
        return "redirect:/capacitaciones/listarCapacitaciones";
    }
}
