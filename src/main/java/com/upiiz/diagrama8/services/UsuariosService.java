package com.upiiz.diagrama8.services;

import com.upiiz.diagrama8.models.Usuario;
import com.upiiz.diagrama8.repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;
@Service
public class UsuariosService {
    UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return this.usuariosRepository.obtenerTodas();
    }

    public Usuario getUsuarioById(Long id) {
        return this.usuariosRepository.obtenerPorId(id);
    }

    public Usuario createUsuario(Usuario usuario) {
        return this.usuariosRepository.guardar(usuario);
    }

    public Usuario updateUsuario(Usuario usuario) {
        return this.usuariosRepository.actualizar(usuario);
    }

    public List<Usuario> getAllUsuarioByVeterinarioId(Long id_veterinario) {
        return this.usuariosRepository.getAllUsuarioByVeterinarioId(id_veterinario);
    }
    public void deleteUsuario(Long id) {
        this.usuariosRepository.eliminar(id);
    }


}
