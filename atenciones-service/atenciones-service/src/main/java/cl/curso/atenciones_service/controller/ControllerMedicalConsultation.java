package cl.curso.atenciones_service.controller;
import cl.curso.atenciones_service.model.MedicalConsultation ;
import cl.curso.atenciones_service.model.MedicalHistory;
import cl.curso.atenciones_service.model.Patient;
import cl.curso.atenciones_service.service.MedicalService;
import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/medical-service")

public class ControllerMedicalConsultation {
    
     private final MedicalService medicalService;

    public ControllerMedicalConsultation(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return medicalService.findAllPatients();
    }

    @GetMapping("/patients/{id}")
    public Patient getPatientById(
            @PathVariable("id")
            @Positive(message = "El ID debe ser mayor que cero")
            long id
    ) {
        return medicalService.findPatientById(id);
    }

    @GetMapping("/histories")
    public List<MedicalHistory> getHistories() {
        return medicalService.findAllMedicalHistories();
    }

    @GetMapping("/attentions")
    public List<MedicalConsultation> getAttentions() {
        return medicalService.findAllMedicalConsultations();
    }

    @GetMapping("/patients/{id}/history")
    public MedicalHistory getPatientHistory(
            @PathVariable("id")
            @Positive(message = "El ID debe ser mayor que cero")
            long id
    ) {
        return medicalService.findHistoryByPatientId(id);
    }

    @GetMapping("/patients/{id}/attentions")
    public List<MedicalConsultation> getPatientAttentions(
            @PathVariable("id")
            @Positive(message = "El ID debe ser mayor que cero")
            long id
    ) {
        return medicalService.findConsultationsByPatientId(id);
    }
}

