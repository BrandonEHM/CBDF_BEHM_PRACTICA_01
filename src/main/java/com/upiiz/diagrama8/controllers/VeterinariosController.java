package com.upiiz.diagrama8.controllers;

import com.upiiz.diagrama8.models.Veterinario;
import com.upiiz.diagrama8.services.VeterinariosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/api/v1/veterinarios"}) // Cambiado a "veterinarios"
@RestController
public class VeterinariosController {

    VeterinariosService veterinariosService; // Cambio de mascotasService a veterinariosService

    public VeterinariosController(VeterinariosService veterinariosService) {
        this.veterinariosService = veterinariosService;
    }

    @GetMapping
    public ResponseEntity<List<Veterinario>> getVeterinarios() { // Cambio de getMascotas a getVeterinarios
        return ResponseEntity.ok(this.veterinariosService.getAllVeterinarios());
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Veterinario> getVeterinario(@PathVariable Long id) { // Cambio de getMascota a getVeterinario
        return ResponseEntity.ok(this.veterinariosService.getVeterinarioById(id));
    }

    @PostMapping
    public ResponseEntity<Veterinario> addVeterinario(@RequestBody Veterinario veterinario) { // Cambio de addMascota a addVeterinario
        return ResponseEntity.ok(this.veterinariosService.createVeterinario(veterinario));
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Veterinario> updateVeterinario(@RequestBody Veterinario veterinario, @PathVariable Long id) { // Cambio de updateMascota a updateVeterinario
        veterinario.setId_veterinario(id);
        return ResponseEntity.ok(this.veterinariosService.updateVeterinario(veterinario));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteVeterinario(@PathVariable Long id) { // Cambio de deleteMascota a deleteVeterinario
        this.veterinariosService.deleteVeterinario(id);
        return ResponseEntity.noContent().build();
    }
}