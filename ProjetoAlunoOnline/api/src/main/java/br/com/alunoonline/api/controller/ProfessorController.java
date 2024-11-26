package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/professores")
public class ProfessorController {

    @Autowired // Injetando Service ao BD
    ProfessorService ProfessorService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void criarProfessor(@RequestBody Professor professor) { // O REquestBody tá transformando professor de Jason em Java
        ProfessorService.CriarProfessor(professor);
    }
}

