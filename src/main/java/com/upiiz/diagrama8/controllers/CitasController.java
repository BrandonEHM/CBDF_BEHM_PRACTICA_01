package com.upiiz.diagrama8.controllers;


import com.upiiz.diagrama8.models.Cita;
import com.upiiz.diagrama8.models.Usuario;
import com.upiiz.diagrama8.services.CitasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/api/v1/citas"})
@RestController
public class CitasController {

    CitasService citasService;

    public CitasController(CitasService citasService) {
        this.citasService = citasService;
    }

    @GetMapping
        public ResponseEntity<List<Cita>> getCategorias() {
        return ResponseEntity.ok(this.citasService.getAllCitas());
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Cita> getCita(@PathVariable Long id) {
        return ResponseEntity.ok(this.citasService.getCitaById(id));
    }

    @PostMapping
    public ResponseEntity<Cita> addCita(@RequestBody Cita cita) {
        return ResponseEntity.ok(this.citasService.createCita(cita));
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Cita> updateCita(@RequestBody Cita cita, @PathVariable Long id) {
        cita.setId(id);
        return ResponseEntity.ok(this.citasService.updateCita(cita));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteCita(@PathVariable Long id) {
        this.citasService.deleteCita(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/mascota/{idMascota}")
    public ResponseEntity<List<Cita>> getCitasByIdMascota(@PathVariable Long idMascota) {
        return ResponseEntity.ok(this.citasService.getCitasByIdMascota(idMascota));
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<Cita>> getCitasByIdUsuario(@PathVariable Long idUsuario) {
        return ResponseEntity.ok(this.citasService.getCitasByIdUsuario(idUsuario));
    }

    @GetMapping("/veterinario/{idVeterinario}")
    public ResponseEntity<List<Cita>> getCitasByIdVeterinario(@PathVariable Long idVeterinario) {
        return ResponseEntity.ok(this.citasService.getCitasByIdVeterinario(idVeterinario));
    }
}
