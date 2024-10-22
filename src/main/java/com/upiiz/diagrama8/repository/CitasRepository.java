package com.upiiz.diagrama8.repository;

import com.upiiz.diagrama8.models.Cita;
import com.upiiz.diagrama8.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class CitasRepository {
    private List<Cita> citas = new ArrayList();
    private AtomicLong id = new AtomicLong();

    public CitasRepository() {
    }

    public Cita guardar(Cita cita) {
        cita.setId(this.id.incrementAndGet());
        this.citas.add(cita);
        return cita;
    }

    public List<Cita> obtenerTodas() {
        return this.citas;
    }

    public Cita obtenerPorId(Long id) {
        return (Cita) this.citas.stream().filter((cita) -> {
            return cita.getId().equals(id);
        }).findFirst().orElse((Cita) null);
    }

    public void eliminar(Long id) {
        this.citas.removeIf((cita) -> {
            return cita.getId().equals(id);
        });
    }

    public Cita actualizar(Cita cita) {
        this.eliminar(cita.getId());
        this.citas.add(cita);
        return cita;
    }


    public List<Cita> obtenerPorIdMascota(Long idMascota) {
        return this.citas.stream()
                .filter(cita -> cita.getIdmascota().equals(idMascota))
                .collect(Collectors.toList());
    }

    public List<Cita> obtenerPorIdUsuario(Long idUsuario) {
        return this.citas.stream()
                .filter(cita -> cita.getIdusuario().equals(idUsuario))
                .collect(Collectors.toList());
    }

    public List<Cita> obtenerPorIdVeterinario(Long idVeterinario) {
        return this.citas.stream()
                .filter(cita -> cita.getIdveterinario().equals(idVeterinario))
                .collect(Collectors.toList());
    }

}