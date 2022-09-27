package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Empresa;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface IEmpresaService {

    public Empresa criarNova(Empresa nova);

    public Empresa atualizarDados(Empresa dados);

    public ArrayList<Empresa> buscarTodas();

    public Empresa buscarPeloId(Integer id);

    public Empresa buscarPorNome(String nome);
}
