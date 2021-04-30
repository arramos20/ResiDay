package com.arramos.ResiDay.repository;

import com.arramos.ResiDay.security.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findFirstByEmail(String email);
}
