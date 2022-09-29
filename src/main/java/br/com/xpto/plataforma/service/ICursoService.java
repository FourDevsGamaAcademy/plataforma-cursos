package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.model.Aluno;
import br.com.xpto.plataforma.model.Curso;

import java.util.ArrayList;

public interface ICursoService {
    ArrayList<Curso> recuperarTodos();

    Curso recuperarPeloId(Integer codigo);

    Curso buscarPorNome(String nome);

    Curso cadastrarNovo(Curso novo);

    void excluirCurso(Integer Id);

    Curso atualizarDados(Integer id, Curso novoCurso);
}
