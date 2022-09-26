package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Empresa;
import io.swagger.models.auth.In;

import java.util.ArrayList;

public interface IEmpresaService {

    public Empresa criarNova(Empresa nova);

    public Empresa atualizarDados(Empresa dados);

    public ArrayList<Empresa> buscarTodas();

    public Empresa buscarPeloId(Integer id);

    public Empresa buscarPeloNome(String nome);

    public void excluirEmpresa(Integer id);
}
