package com.upiiz.diagrama8.services;

import com.upiiz.diagrama8.models.Cita;
import com.upiiz.diagrama8.models.Usuario;
import com.upiiz.diagrama8.repository.CitasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitasService {
    CitasRepository citasRepository;

    public CitasService(CitasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }

    public List<Cita> getAllCitas() {
        return this.citasRepository.obtenerTodas();
    }

    public Cita getCitaById(Long id) {
        return this.citasRepository.obtenerPorId(id);
    }

    public Cita createCita(Cita cita) {
        return this.citasRepository.guardar(cita);
    }

    public Cita updateCita(Cita cita) {
        return this.citasRepository.actualizar(cita);
    }

    public void deleteCita(Long id) {
        this.citasRepository.eliminar(id);
    }

    public List<Cita> getCitasByIdMascota(Long idMascota) {
        return this.citasRepository.obtenerPorIdMascota(idMascota);
    }

    public List<Cita> getCitasByIdUsuario(Long idUsuario) {
        return this.citasRepository.obtenerPorIdUsuario(idUsuario);
    }

    public List<Cita> getCitasByIdVeterinario(Long idVeterinario) {
        return this.citasRepository.obtenerPorIdVeterinario(idVeterinario);
    }
}

