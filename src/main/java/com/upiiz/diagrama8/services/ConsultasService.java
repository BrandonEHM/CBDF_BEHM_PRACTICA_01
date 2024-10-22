package com.upiiz.diagrama8.services;

import com.upiiz.diagrama8.models.Consulta;
import com.upiiz.diagrama8.repository.ConsultasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultasService {
    ConsultasRepository consultasRepository;

    public ConsultasService(ConsultasRepository consultasRepository) {
        this.consultasRepository = consultasRepository;
    }

    public List<Consulta> getAllConsultas() {
        return this.consultasRepository.obtenerTodas();
    }

    public Consulta getConsultaById(Long id) {
        return this.consultasRepository.obtenerPorId(id);
    }

    public Consulta createConsulta(Consulta consulta) {
        return this.consultasRepository.guardar(consulta);
    }

    public Consulta updateConsulta(Consulta consulta) {
        return this.consultasRepository.actualizar(consulta);
    }

    public void deleteConsulta(Long id) {
        this.consultasRepository.eliminar(id);
    }

    public List<Consulta> getAllConsultasByVeterinarioId(Long idVeterinario) {
        return this.consultasRepository.getAllConsultasByVeterinarioId(idVeterinario);
    }

    public List<Consulta> getAllConsultasByMascotaId(Long idMascota) {
        return this.consultasRepository.getAllConsultasByMascotaId(idMascota);
    }

    public List<Consulta> getAllConsultasByCitaId(Long idCita) {
        return this.consultasRepository.getAllConsultasByCitaId(idCita);
    }
}
