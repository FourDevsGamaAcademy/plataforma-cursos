package br.com.xpto.plataforma.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xpto.plataforma.dao.CursoDAO;
import br.com.xpto.plataforma.model.Curso;

@Service("CursoImpl")
public class CursoServiceImpl implements ICursoService{
	@Autowired
	private CursoDAO dao;

	@Override
	public ArrayList<Curso> recuperarTodos() {
		return (ArrayList<Curso>)dao.findAll();
	}

	@Override
	public Curso recuperarPeloId(Integer codigo) {
		return dao.findById(codigo).orElse(null);
	}

	@Override
	public Curso cadastrarNovo(Curso novo) {
		return dao.save(novo);
	}

	@Override
	public void excluirCurso(Integer Id) {
		dao.deleteById(Id);		
	}

	@Override
	public Curso atualizarStatusCurso(Curso status) {
		if (status.getCursoId() != null && status.getStatus_curso() != null) {
			return dao.save(status);
		}
		return null;
	}

	@Override
	public Curso buscarPorNome(String nome) {
		return null;
	}

}
