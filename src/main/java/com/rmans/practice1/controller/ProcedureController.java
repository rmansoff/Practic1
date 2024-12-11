package com.rmans.practice1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmans.practice1.model.Procedure;
import com.rmans.practice1.service.ProcedureService;

@RestController
@RequestMapping("/api/procedures")
public class ProcedureController {

    @Autowired
    private ProcedureService procedureService;

    @PostMapping
    public Procedure createProcedure(@RequestBody Procedure procedure) {
        return procedureService.createProcedure(procedure);
    }

    @GetMapping
    public List<Procedure> getAllProcedures() {
        return procedureService.getAllProcedures();
    }

    @GetMapping("/{id}")
    public Procedure getProcedureById(@PathVariable Long id) {
        return procedureService.getProcedureById(id);
    }

    @PutMapping("/{id}")
    public Procedure updateProcedure(@PathVariable Long id, @RequestBody Procedure procedure) {
        return procedureService.updateProcedure(id, procedure);
    }

    @DeleteMapping("/{id}")
    public void deleteProcedure(@PathVariable Long id) {
        procedureService.deleteProcedure(id);
    }
}
