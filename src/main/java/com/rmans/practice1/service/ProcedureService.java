package com.rmans.practice1.service;

import com.rmans.practice1.model.Procedure;
import com.rmans.practice1.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    public Procedure createProcedure(Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    public List<Procedure> getAllProcedures() {
        return procedureRepository.findAll();
    }

    public Procedure getProcedureById(Long id) {
        Optional<Procedure> procedure = procedureRepository.findById(id);
        return procedure.orElseThrow(() -> new RuntimeException("Procedure not found"));
    }

    public Procedure updateProcedure(Long id, Procedure procedureDetails) {
        Procedure procedure = getProcedureById(id);
        procedure.setName(procedureDetails.getName());
        procedure.setDuration(procedureDetails.getDuration());
        procedure.setDescription(procedureDetails.getDescription());
        return procedureRepository.save(procedure);
    }

    public void deleteProcedure(Long id) {
        procedureRepository.deleteById(id);
    }
}
