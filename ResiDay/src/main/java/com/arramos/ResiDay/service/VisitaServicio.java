package com.arramos.ResiDay.service;

import com.arramos.ResiDay.repository.UsuarioRepository;
import com.arramos.ResiDay.repository.VisitasRepository;
import com.arramos.ResiDay.security.model.Usuario;
import com.arramos.ResiDay.security.model.Visita;
import com.arramos.ResiDay.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VisitaServicio extends BaseService<Visita, Long, VisitasRepository> {

    public VisitaServicio(VisitasRepository repo) {
        super(repo);
    }

    public Optional<Visita> buscarPorId(Long id) {
        return repositorio.findFirstById(id);
    }
}
