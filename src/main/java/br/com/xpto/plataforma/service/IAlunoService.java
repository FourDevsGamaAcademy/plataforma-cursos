package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Aluno;

import java.util.ArrayList;

public interface IAlunoService {

    Aluno cadastrarNovoAluno(Aluno novo);
    Aluno atualizarDados(Aluno dados);
    ArrayList<Aluno> buscarTodos();
    Aluno buscarPeloId(Integer id);
    Aluno buscarCpf(String cpf);
    void excluirAluno(Integer id);
}
