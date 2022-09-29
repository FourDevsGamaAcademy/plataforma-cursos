package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Inscricao;

import java.util.ArrayList;


public interface IInscricaoService {
    public ArrayList<Inscricao> recuperarTodas();

    public Inscricao recuperarPeloId(Integer id);

    public Inscricao cadastrarNovo(Inscricao novo);

    public void excluirInscricao(Integer Id);

    public Inscricao atualizarDados(Integer id, Inscricao novaInscricao);

}
