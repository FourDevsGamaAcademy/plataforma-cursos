package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Curso;
import br.com.xpto.plataforma.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class CursoController {
    @Autowired
    @Qualifier("CursoImpl")
    private ICursoService service;

    //recuperar todos
    @GetMapping("/cursos/todos")
    public ArrayList<Curso> recuperarTodoMundo() {
        return service.recuperarTodos();
    }

    //recuperar pelo ID
    @GetMapping("/cursos/{id}")
    public ResponseEntity<Curso> recuperarPeloId(@PathVariable Integer id) {
        Curso res = service.recuperarPeloId(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    //cadastrar
    @PostMapping("/cursos")
    public ResponseEntity<Curso> inserirNovoCurso(@RequestBody Curso novo) {
        Curso res = service.cadastrarNovo(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    //excluir
    @DeleteMapping("/cursos/{id}")
    public ResponseEntity<Curso> excluirCurso(@PathVariable Integer id) {
        service.excluirCurso(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/cursos/{id}")
    public ResponseEntity<Curso> atualizarStatusCurso(@RequestBody Curso novoCurso, @PathVariable Integer id) {
        Curso res = service.atualizarDados(id, novoCurso);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

}
