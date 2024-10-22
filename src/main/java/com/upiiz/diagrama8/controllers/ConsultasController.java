package com.upiiz.diagrama8.controllers;

import com.upiiz.diagrama8.models.Consulta;
import com.upiiz.diagrama8.services.ConsultasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/api/v1/consultas"}) // Cambiado a "consultas"
@RestController
public class ConsultasController {

    ConsultasService consultasService; // Cambio de mascotasService a consultasService

    public ConsultasController(ConsultasService consultasService) {
        this.consultasService = consultasService;
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> getConsultas() { // Cambio de getMascotas a getConsultas
        return ResponseEntity.ok(this.consultasService.getAllConsultas());
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Consulta> getConsulta(@PathVariable Long id) { // Cambio de getMascota a getConsulta
        return ResponseEntity.ok(this.consultasService.getConsultaById(id));
    }

    @PostMapping
    public ResponseEntity<Consulta> addConsulta(@RequestBody Consulta consulta) { // Cambio de addMascota a addConsulta
        return ResponseEntity.ok(this.consultasService.createConsulta(consulta));
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Consulta> updateConsulta(@RequestBody Consulta consulta, @PathVariable Long id) { // Cambio de updateMascota a updateConsulta
        consulta.setId(id);
        return ResponseEntity.ok(this.consultasService.updateConsulta(consulta));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteConsulta(@PathVariable Long id) { // Cambio de deleteMascota a deleteConsulta
        this.consultasService.deleteConsulta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/veterinario/{id}")
    public ResponseEntity<List<Consulta>> getConsultasByVeterinarioId(@PathVariable Long id) {
        return ResponseEntity.ok(this.consultasService.getAllConsultasByVeterinarioId(id));
    }

    @GetMapping("/mascota/{id}")
    public ResponseEntity<List<Consulta>> getConsultasByMascotaId(@PathVariable Long id) {
        return ResponseEntity.ok(this.consultasService.getAllConsultasByMascotaId(id));
    }

    @GetMapping("/cita/{id}")
    public ResponseEntity<List<Consulta>> getConsultasByCitaId(@PathVariable Long id) {
        return ResponseEntity.ok(this.consultasService.getAllConsultasByCitaId(id));
    }
}
