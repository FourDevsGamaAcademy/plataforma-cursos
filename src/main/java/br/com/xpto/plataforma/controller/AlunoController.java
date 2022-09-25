package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Aluno;
import br.com.xpto.plataforma.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AlunoController {

    @Autowired
    private IAlunoService service;

    @GetMapping("/aluno")
    public ArrayList<Aluno> recuperarTodos(){
        return service.buscarTodos();
    }

    @GetMapping("/aluno/{cpf}")
    public ResponseEntity<Aluno> retornarAlunoCpf(@PathVariable String cpf){
        return null;
    }

    @PostMapping("/aluno")
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno){
        Aluno res = service.cadastrarNovoAluno(aluno);
        if (res != null){
            return ResponseEntity.ok(res);
        }
            return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/aluno/{id}")
    public ResponseEntity<Aluno> excluirAluno(@PathVariable Integer id){
        service.excluirAluno(id);
        return null;
    }

}
