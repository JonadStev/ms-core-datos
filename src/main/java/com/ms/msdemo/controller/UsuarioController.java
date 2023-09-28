package com.ms.msdemo.controller;

import com.ms.msdemo.dto.RespuestaHttp;
import com.ms.msdemo.model.Usuario;
import com.ms.msdemo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.getUsuarioById(id).orElse(null);
        if (usuario != null) {
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsario(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RespuestaHttp> eliminarUsuario(@PathVariable Long id) {
        try {
            usuarioService.eliminarUsuarioById(id);
            RespuestaHttp respuesta = new RespuestaHttp("Usuario con ID " + id + " eliminado con éxito");
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        } catch (Exception e) {
            RespuestaHttp respuesta = new RespuestaHttp("No se pudo eliminar el usuario con ID " + id);
            return new ResponseEntity<>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
