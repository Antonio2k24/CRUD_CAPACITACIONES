package com.idat.capacitaciones.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="tb_capacitacion")
@Data
@Getter
@Setter

public class Capacitaciones {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "tb_capacitacion")
    private Integer Id;

    @Column(name = "descripcion", length =200, nullable = false)
    private String desCapacitacion;

    @Column(name = "fecha_inicio", nullable = false)
    private String fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private String fechaFin;

    @Column(name = "estado", nullable = false)
    private int estado;

    @Column(name = "creditos", nullable = false)
    private int creditos;
}
