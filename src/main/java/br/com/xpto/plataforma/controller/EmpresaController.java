package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.dao.EmpresaDAO;
import br.com.xpto.plataforma.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpresaController {

    @Autowired
  private EmpresaDAO dao;

    @GetMapping("/empresa")
    public ArrayList<Empresa> recuperarTodas(){
        ArrayList<Empresa> lista;
        lista = (ArrayList<Empresa>) dao.findAll();
        return  lista;
    }


}
