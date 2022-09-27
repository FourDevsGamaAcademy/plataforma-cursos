package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Aluno;

import java.util.ArrayList;

public interface IAlunoService {

    Aluno cadastrarNovoAluno(Aluno novo);
    ArrayList<Aluno> buscarTodos();
    Aluno atualizarDados(Aluno dados);
    void excluirAluno(Integer id);
    Aluno buscarCpf(String cpf);
    Aluno buscarPeloId(Integer id);
}
