package com.arramos.ResiDay.repository;

import com.arramos.ResiDay.security.model.Residente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ResidenteRepository extends JpaRepository<Residente, Long>{

    Optional<Residente> findFirstById(Long id);
}
