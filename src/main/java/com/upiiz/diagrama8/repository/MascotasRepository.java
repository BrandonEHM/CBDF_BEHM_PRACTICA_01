package com.upiiz.diagrama8.repository;
import com.upiiz.diagrama8.models.Mascota;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class MascotasRepository {
    private List<Mascota> mascotas = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public MascotasRepository() {
    }

    public Mascota guardar(Mascota mascota) {
        mascota.setId(this.id.incrementAndGet());
        this.mascotas.add(mascota);
        return mascota;
    }

    public List<Mascota> obtenerTodas() {
        return this.mascotas;
    }

    public Mascota obtenerPorId(Long id) {
        return (Mascota) this.mascotas.stream().filter((mascota) -> {
            return mascota.getId().equals(id);
        }).findFirst().orElse((Mascota) null);
    }

    public void eliminar(Long id) {
        this.mascotas.removeIf((mascota) -> {
            return mascota.getId().equals(id);
        });
    }

    public Mascota actualizar(Mascota mascota) {
        this.eliminar(mascota.getId());
        this.mascotas.add(mascota);
        return mascota;
    }

    public List<Mascota> getAllMascotasByUsuarioId(Long idUsuario) {
        return mascotas.stream()
                .filter(mascota -> mascota.getIdUsuario().equals(idUsuario))
                .collect(Collectors.toList());
    }
}
