package com.arramos.ResiDay.repository;

import com.arramos.ResiDay.security.model.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitasRepository extends JpaRepository<Visita, Long>{

    Optional<Visita> findFirstById(Long id);
}
