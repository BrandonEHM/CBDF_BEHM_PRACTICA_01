package com.upiiz.diagrama8.repository;

import com.upiiz.diagrama8.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UsuariosRepository {
    private List<Usuario> usuarios = new ArrayList();
    private AtomicLong id = new AtomicLong();


    public UsuariosRepository() {
    }
    public Usuario guardar(Usuario usuario) {
        usuario.setId(this.id.incrementAndGet());
        this.usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> obtenerTodas() {
        return this.usuarios;
    }

    public Usuario obtenerPorId(Long id) {
        return (Usuario) this.usuarios.stream().filter((usuario) -> {
            return usuario.getId().equals(id);
        }).findFirst().orElse((Usuario) null);
    }

    public void eliminar(Long id) {
        this.usuarios.removeIf((usuario) -> {
            return usuario.getId().equals(id);
        });
    }

    public Usuario actualizar(Usuario usuario) {
        this.eliminar(usuario.getId());
        this.usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> getAllUsuarioByVeterinarioId(Long id_veterinario) {
        return usuarios.stream().filter(usuario -> usuario.getId_veterinario().equals(id_veterinario)).toList();
    }

}
