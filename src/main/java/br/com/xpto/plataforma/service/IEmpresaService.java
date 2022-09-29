package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Empresa;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface IEmpresaService {

    Empresa criarNova(Empresa nova);

    Empresa atualizarDados(Integer id, Empresa novaEmpresa);

    ArrayList<Empresa> buscarTodas();

    Empresa buscarPeloId(Integer id);

    Empresa buscarPorNome(String nome);

    void excluirEmpresa(Integer id);
}
