package com.upiiz.diagrama8.controllers;

import com.upiiz.diagrama8.models.Usuario;
import com.upiiz.diagrama8.services.UsuariosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/api/v1/usuarios"})
@RestController
public class UsuariosController {


    UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        return ResponseEntity.ok(this.usuariosService.getAllUsuarios());
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Usuario> getUsuario(@PathVariable Long id) {
        return ResponseEntity.ok(this.usuariosService.getUsuarioById(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(this.usuariosService.createUsuario(usuario));
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
        usuario.setId(id);
        return ResponseEntity.ok(this.usuariosService.updateUsuario(usuario));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        this.usuariosService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/veterinario/{id}")
    public ResponseEntity<List<Usuario>> getUsuariosByVeterinarioId(@PathVariable Long id) {
        return ResponseEntity.ok(this.usuariosService.getAllUsuarioByVeterinarioId(id));
    }
}