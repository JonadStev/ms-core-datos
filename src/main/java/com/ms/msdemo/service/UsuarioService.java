package com.ms.msdemo.service;

import com.ms.msdemo.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario crearUsario(Usuario usuario);
    Optional<Usuario> getUsuarioById(long id);
    boolean eliminarUsuarioById(long id);
    List<Usuario> getAllUsuarios();
}
