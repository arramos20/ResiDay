package com.arramos.ResiDay.security.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Residente {

    @Id
    @GeneratedValue
    private Long dni;

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaEntradaResidencia;
    private LocalDate fechaSalida;
    private String causaSalida;

    //Con fechaSalida
    public Residente(String nombre, String apellidos, LocalDate fechaNacimiento, LocalDate fechaEntradaResidencia, LocalDate fechaSalida, String causaSalida) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaEntradaResidencia = LocalDate.now(); //Para que tenga hoy como fecha de entrada si generamos un nuevo residente
        this.fechaSalida = fechaSalida;
        this.causaSalida = causaSalida;
    }

    //Sin fechaSalida ni causaSalida (porque sigue en la residencia)
    public Residente(String nombre, String apellidos, LocalDate fechaNacimiento, LocalDate fechaEntradaResidencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaEntradaResidencia = LocalDate.now(); //Para que tenga hoy como fecha de entrada si generamos un nuevo residente
    }
}
