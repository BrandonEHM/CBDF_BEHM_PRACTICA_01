package com.upiiz.diagrama8.controllers;

import com.upiiz.diagrama8.models.Mascota;
import com.upiiz.diagrama8.services.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequestMapping("/api/v1/mascotas") // Cambiado a "mascotas"
@RestController

public class MascotasController {
    private final MascotasService mascotasService;
    //MascotasService mascotasService; // Cambio de categoriasService a mascotasService
    @Autowired
    public MascotasController(MascotasService mascotasService) {
        this.mascotasService = mascotasService;
    }

    @GetMapping
    public ResponseEntity<List<Mascota>> getMascotas() { // Cambio de getCategorias a getMascotas
        return ResponseEntity.ok(this.mascotasService.getAllMascotas());
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Mascota> getMascota(@PathVariable Long id) { // Cambio de getCategoria a getMascota
        return ResponseEntity.ok(this.mascotasService.getMascotaById(id));
    }

    @PostMapping
    public ResponseEntity<Mascota> addMascota(@RequestBody Mascota mascota) { // Cambio de addCategoria a addMascota
        return ResponseEntity.ok(this.mascotasService.createMascota(mascota));
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Mascota> updateMascota(@RequestBody Mascota mascota, @PathVariable Long id) { // Cambio de updateCategoria a updateMascota
        mascota.setId(id);
        return ResponseEntity.ok(this.mascotasService.updateMascota(mascota));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteMascota(@PathVariable Long id) { // Cambio de deleteCategoria a deleteMascota
        this.mascotasService.deleteMascota(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<List<Mascota>> getMascotasByUsuarioId(@PathVariable Long id) {
        return ResponseEntity.ok(this.mascotasService.getAllMascotasByUsuarioId(id));
    }


}
