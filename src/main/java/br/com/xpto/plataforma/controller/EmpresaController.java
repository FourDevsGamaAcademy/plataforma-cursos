package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.dao.EmpresaDAO;
import br.com.xpto.plataforma.model.Empresa;
import br.com.xpto.plataforma.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public Empresa incluirNova(@RequestBody Empresa nova) {
      return service.criarNova(nova);
    }
}



