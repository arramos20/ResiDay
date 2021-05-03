package com.arramos.ResiDay.service;

import com.arramos.ResiDay.repository.UsuarioRepository;
import com.arramos.ResiDay.security.model.Usuario;
import com.arramos.ResiDay.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepository> {

    public UsuarioServicio(UsuarioRepository repo) {
        super(repo);
    }

    public Optional<Usuario> buscarPorEmail(String email) {
        return repositorio.findFirstByEmail(email);
    }
}
