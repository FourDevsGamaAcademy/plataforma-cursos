package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Empresa;
import br.com.xpto.plataforma.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class EmpresaController {

    @Autowired
    private IEmpresaService service;

    @GetMapping("/empresas/todos")
    public ArrayList<Empresa> recuperarTodas() {
        return service.buscarTodas();
    }

    @PostMapping("/empresas")
    public ResponseEntity<Empresa> incluirNova(@RequestBody Empresa nova){
        Empresa resultado = service.criarNova(nova);
        if (resultado != null){
            return ResponseEntity.ok(resultado);
        }
        else {
           return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/empresas/{id}")
    public ResponseEntity<Empresa> alterar(@RequestBody Empresa novaEmpresa, @PathVariable Integer id){
        Empresa res = service.atualizarDados(id, novaEmpresa);
        if (res != null){
            return ResponseEntity.ok(res);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/empresas/{id}")
    public ResponseEntity<Empresa> buscarPorId(@PathVariable Integer id){
        Empresa resultado = service.buscarPeloId(id);
        if (resultado != null){
            return ResponseEntity.ok(resultado);
        } else {
            return null;
        }
    }

    @DeleteMapping("/empresas/{id}")
    public ResponseEntity<Empresa> excluirEmpresa(@PathVariable Integer id) {
        service.excluirEmpresa(id);
        return null;
    }
}



