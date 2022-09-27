package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Empresa;
import br.com.xpto.plataforma.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpresaController {

    @Autowired
    private IEmpresaService service;

    @GetMapping("/empresas")
    public ArrayList<Empresa> recuperarTodas() {
        return service.buscarTodas();
    }

    @PostMapping("/empresa")
    public ResponseEntity<Empresa> incluirNova(@RequestBody Empresa nova){
        Empresa resultado = service.criarNova(nova);
        if (resultado != null){
            return ResponseEntity.ok(resultado);
        }
        else {
           return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/empresa")
    public ResponseEntity<Empresa> alterar(@RequestBody Empresa dados){
        Empresa resultado = service.atualizarDados(dados);
        if (resultado != null){
            return ResponseEntity.ok(resultado);
        }else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<Empresa> buscarPorId(@PathVariable Integer id){
        Empresa resultado = service.buscarPeloId(id);
       if(resultado != null){
           return ResponseEntity.ok(resultado);
       } else {
           return null;
       }
    }
}



