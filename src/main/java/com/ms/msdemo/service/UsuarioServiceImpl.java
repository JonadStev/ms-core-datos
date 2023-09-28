package com.ms.msdemo.service;

import com.ms.msdemo.model.Usuario;
import com.ms.msdemo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public Usuario crearUsario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> getUsuarioById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public boolean eliminarUsuarioById(long id) {
        usuarioRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
}
