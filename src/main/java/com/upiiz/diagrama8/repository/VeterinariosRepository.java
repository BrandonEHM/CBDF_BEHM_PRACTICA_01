package com.upiiz.diagrama8.repository;

import com.upiiz.diagrama8.models.Veterinario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class VeterinariosRepository {
    private List<Veterinario> veterinarios = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public VeterinariosRepository() {
    }

    public Veterinario guardar(Veterinario veterinario) {
        veterinario.setId_veterinario(this.id.incrementAndGet());
        this.veterinarios.add(veterinario);
        return veterinario;
    }

    public List<Veterinario> obtenerTodos() {
        return this.veterinarios;
    }

    public Veterinario obtenerPorId(Long id) {
        return (Veterinario) this.veterinarios.stream().filter((veterinario) -> {
            return veterinario.getId_veterinario().equals(id);
        }).findFirst().orElse((Veterinario) null);
    }

    public void eliminar(Long id) {
        this.veterinarios.removeIf((veterinario) -> {
            return veterinario.getId_veterinario().equals(id);
        });
    }

    public Veterinario actualizar(Veterinario veterinario) {
        this.eliminar(veterinario.getId_veterinario());
        this.veterinarios.add(veterinario);
        return veterinario;
    }
}