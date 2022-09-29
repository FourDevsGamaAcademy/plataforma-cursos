package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Aluno;
import br.com.xpto.plataforma.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class AlunoController {

    @Autowired
    private IAlunoService service;

    @PostMapping("/alunos")
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno){
        Aluno res = service.cadastrarNovoAluno(aluno);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/alunos")
    public ResponseEntity<ArrayList<Aluno>> recuperarTodos(){
        ArrayList<Aluno> res = service.buscarTodos();
        if (!res.isEmpty()){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/alunos/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@RequestBody Aluno novoAluno, @PathVariable Integer id){
        Aluno res = service.atualizarDados(id, novoAluno);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/alunos/{id}")
    public ResponseEntity<Aluno> excluirAluno(@PathVariable Integer id){
        service.excluirAluno(id);
        return null;
    }

    @GetMapping("/alunos/{cpf}")
    public ResponseEntity<Aluno> retornarAlunoCpf(@PathVariable String cpf){
        Aluno res = service.buscarCpf(cpf);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
}