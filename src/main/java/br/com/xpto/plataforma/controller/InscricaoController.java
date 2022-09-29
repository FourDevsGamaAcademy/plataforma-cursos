package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Inscricao;
import br.com.xpto.plataforma.service.IInscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class InscricaoController {
    @Autowired
    @Qualifier("InscricaoServiceImpl")
    private IInscricaoService service;

    //recuperar todos

    @GetMapping("/inscricoes/todos")
    public ArrayList<Inscricao> recuperarTodoMundo() {
        return service.recuperarTodas();
    }

    //recuperar pelo ID
    @GetMapping("/inscricoes/{id}")
    public ResponseEntity<Inscricao> recuperarPeloId(@PathVariable Integer id) {
        Inscricao res = service.recuperarPeloId(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    //cadastrar
    @PostMapping("/inscricoes")
    public ResponseEntity<Inscricao> inserirNovoCurso(@RequestBody Inscricao novo) {
        Inscricao res = service.cadastrarNovo(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    //excluir
    @DeleteMapping("/inscricoes/{id}")
    public ResponseEntity<Inscricao> excluirInscricao(@PathVariable Integer id) {
        service.excluirInscricao(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/inscricoes/{id}")
    public ResponseEntity<Inscricao> atualizarStatusInscricao(@RequestBody Inscricao novaInscricao, @PathVariable Integer id) {
        Inscricao res = service.atualizarDados(id, novaInscricao);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

}
