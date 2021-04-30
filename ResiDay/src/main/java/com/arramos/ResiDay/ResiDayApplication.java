package com.arramos.ResiDay;

import com.arramos.ResiDay.security.model.Familiar;
import com.arramos.ResiDay.security.model.Residente;
import com.arramos.ResiDay.security.model.Trabajador;
import com.arramos.ResiDay.service.UsuarioServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@SpringBootApplication
public class ResiDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResiDayApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UsuarioServicio servicio, PasswordEncoder passwordEncoder) {
		return args -> {

			Trabajador t1=new Trabajador("Luis", "Martínez Sánchez", "lumasa05@residay.com", "ceoresiday12", LocalDate.of(2005, 1, 9), "CEO");
			Trabajador t2=new Trabajador("Martín", "Suárez Pérez", "masupe07@residay.com", "limresiday12", LocalDate.of(2007, 6, 29), "Limpiador");
			Trabajador t3=new Trabajador("Olga", "Ramírez de la Viña", "olravi20@residay.com", "cuiresiday12", LocalDate.of(2020, 9, 12), "Cuidadora");

			servicio.save(t1); servicio.save(t2); servicio.save(t3);

			Familiar f1=new Familiar("Eleanora", "Vericio García", "elvega89@gmail.com", "elvega12", LocalDate.of(1989, 5, 17));
			Familiar f2=new Familiar("Porca", "Meloso Lorenzo", "pomelo00@gmail.com", "pomelo12", LocalDate.of(2000, 11, 12));
			Familiar f3=new Familiar("Nui", "Rimán Álvarez", "nurial99@gmail.com", "nurial12", LocalDate.of(1999, 11, 15));

			servicio.save(f1); servicio.save(f2); servicio.save(f3);

			Residente r1=new Residente("Paula", "Bloom Olmedo", LocalDate.of(1977, 4, 25), LocalDate.of(2002, 2, 3));
			Residente r2=new Residente("Elena", "Toledo Nycte", LocalDate.of(1983, 6, 14), LocalDate.of(2019, 9, 16));
			Residente r3=new Residente("Darla", "Rios Olavide", LocalDate.of(1988, 12, 6), LocalDate.of(2012, 5, 29), LocalDate.of(2017, 9, 5) , "Traslado");

			//Aquí tengo que meterle el servicio de residente

			//Falta visitas








		};

	}
}
