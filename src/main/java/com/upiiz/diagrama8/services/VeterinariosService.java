package com.upiiz.diagrama8.services;

import com.upiiz.diagrama8.models.Veterinario;
import com.upiiz.diagrama8.repository.VeterinariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariosService {
    VeterinariosRepository veterinariosRepository;

    public VeterinariosService(VeterinariosRepository veterinariosRepository) {
        this.veterinariosRepository = veterinariosRepository;
    }

    public List<Veterinario> getAllVeterinarios() {
        return this.veterinariosRepository.obtenerTodos();
    }

    public Veterinario getVeterinarioById(Long id) {
        return this.veterinariosRepository.obtenerPorId(id);
    }

    public Veterinario createVeterinario(Veterinario veterinario) {
        return this.veterinariosRepository.guardar(veterinario);
    }

    public Veterinario updateVeterinario(Veterinario veterinario) {
        return this.veterinariosRepository.actualizar(veterinario);
    }



    public void deleteVeterinario(Long id) {
        this.veterinariosRepository.eliminar(id);
    }
}