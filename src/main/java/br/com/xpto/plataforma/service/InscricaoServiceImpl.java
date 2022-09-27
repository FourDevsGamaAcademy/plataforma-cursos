package br.com.xpto.plataforma.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xpto.plataforma.dao.InscricaoDAO;
import br.com.xpto.plataforma.model.Inscricao;

@Service("InscricaoServiceImpl")
public class InscricaoServiceImpl implements IInscricaoService{
	@Autowired
	private InscricaoDAO dao;
	
	@Override
	public ArrayList<Inscricao> recuperarTodas() {
		return (ArrayList<Inscricao>)dao.findAll();
	}

	@Override
	public Inscricao recuperarPeloId(Integer codigo) {
		return dao.findById(codigo).orElse(null);
	}

	@Override
	public Inscricao cadastrarNovo(Inscricao novo) {
		return dao.save(novo);
	}

	@Override
	public void excluirInscricao(Integer Id) {
		dao.deleteById(Id);		
	}

	@Override
	public Inscricao atualizarStatusInscricao(Inscricao status) {
		if (status.getInscricaoId() != null && status.getStatusInscricao() != null) {
			return dao.save(status);
		}
		return null;
	}

}
