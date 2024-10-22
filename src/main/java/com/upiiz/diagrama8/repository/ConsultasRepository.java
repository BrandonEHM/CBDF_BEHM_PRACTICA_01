package com.upiiz.diagrama8.repository;


import com.upiiz.diagrama8.models.Consulta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class ConsultasRepository {
    private List<Consulta> consultas = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public ConsultasRepository() {
    }

    public Consulta guardar(Consulta consulta) {
        consulta.setId(this.id.incrementAndGet());
        this.consultas.add(consulta);
        return consulta;
    }

    public List<Consulta> obtenerTodas() {
        return this.consultas;
    }

    public Consulta obtenerPorId(Long id) {
        return (Consulta) this.consultas.stream().filter((consulta) -> {
            return consulta.getId().equals(id);
        }).findFirst().orElse((Consulta) null);
    }

    public void eliminar(Long id) {
        this.consultas.removeIf((consulta) -> {
            return consulta.getId().equals(id);
        });
    }

    public Consulta actualizar(Consulta consulta) {
        this.eliminar(consulta.getId());
        this.consultas.add(consulta);
        return consulta;
    }


    public List<Consulta> getAllConsultasByVeterinarioId(Long idVeterinario) {
        return consultas.stream()
                .filter(consulta -> consulta.getIdVeterinario().equals(idVeterinario))
                .collect(Collectors.toList());
    }

    public List<Consulta> getAllConsultasByMascotaId(Long idMascota) {
        return consultas.stream()
                .filter(consulta -> consulta.getIdMascota().equals(idMascota))
                .collect(Collectors.toList());
    }

    public List<Consulta> getAllConsultasByCitaId(Long idCita) {
        return consultas.stream()
                .filter(consulta -> consulta.getIdCita().equals(idCita))
                .collect(Collectors.toList());
    }
}