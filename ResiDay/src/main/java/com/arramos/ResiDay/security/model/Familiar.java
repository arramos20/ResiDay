package com.arramos.ResiDay.security.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
public class Familiar extends Usuario{


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long dni;

    private LocalDate fechaAlta;

    public Familiar(String nombre, String apellidos, String email, String password,
                   LocalDate fechaAlta) {
        super(nombre, apellidos, email, password);
        this.fechaAlta = fechaAlta;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }



}
