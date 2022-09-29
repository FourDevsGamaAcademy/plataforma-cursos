package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Empresa;

import java.util.ArrayList;


public interface IEmpresaService {

    Empresa criarNova(Empresa nova);

    Empresa atualizarDados(Integer id, Empresa novaEmpresa);

    ArrayList<Empresa> buscarTodas();

    Empresa buscarPeloId(Integer id);

    Empresa buscarPorNome(String nome);

    void excluirEmpresa(Integer id);
}
