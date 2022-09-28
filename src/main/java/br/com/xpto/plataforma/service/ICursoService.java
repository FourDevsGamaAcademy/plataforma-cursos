package br.com.xpto.plataforma.service;

import java.util.ArrayList;
import br.com.xpto.plataforma.model.Curso;

public interface ICursoService {
	public ArrayList<Curso> recuperarTodos();
	public Curso recuperarPeloId(Integer codigo);
	public Curso buscarPorNome (String nome);
	public Curso cadastrarNovo(Curso novo);
	public void excluirCurso(Integer Id);
	public Curso atualizarStatusCurso(Curso status);
}
