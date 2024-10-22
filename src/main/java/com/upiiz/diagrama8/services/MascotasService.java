package com.upiiz.diagrama8.services;

import com.upiiz.diagrama8.models.Mascota;
import com.upiiz.diagrama8.repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotasService {

    MascotasRepository mascotasRepository;

    public MascotasService(MascotasRepository mascotasRepository) {
        this.mascotasRepository = mascotasRepository;
    }

    public List<Mascota> getAllMascotas() {
        return this.mascotasRepository.obtenerTodas();
    }

    public Mascota getMascotaById(Long id) {
        return this.mascotasRepository.obtenerPorId(id);
    }

    public Mascota createMascota(Mascota mascota) {
        return this.mascotasRepository.guardar(mascota);
    }

    public Mascota updateMascota(Mascota mascota) {
        return this.mascotasRepository.actualizar(mascota);
    }

    public void deleteMascota(Long id) {
        this.mascotasRepository.eliminar(id);
    }
    public List<Mascota> getAllMascotasByUsuarioId(Long idUsuario) {
        return this.mascotasRepository.getAllMascotasByUsuarioId(idUsuario);
    }
}