package com.arramos.ResiDay.security.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Visita {

    @Id
    @GeneratedValue
    private Long dni;

    private LocalDateTime fechaReserva; //Fecha en la que se hizo la reserva
    private LocalDateTime fechaInicio; //Fecha de inicio de la visita
    private LocalDateTime fechaFin; //Fecha de fin de la visita
    private String observaciones;
    private boolean confirmada;

    public Visita(LocalDateTime fechaReserva, LocalDateTime fechaInicio, LocalDateTime fechaFin, String observaciones, boolean confirmada) {
        this.fechaReserva = LocalDateTime.now();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observaciones = observaciones;
        this.confirmada = confirmada;
    }
}
