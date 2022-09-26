package br.com.xpto.plataforma.service;

import java.util.ArrayList;
import br.com.xpto.plataforma.model.Inscricao;


public interface IInscricaoService {
	public ArrayList<Inscricao> recuperarTodas();
	public Inscricao recuperarPeloId(Integer codigo);
	public Inscricao cadastrarNovo(Inscricao novo);
	public void excluirInscricao(Integer Id);
	public Inscricao atualizarStatusInscricao(Inscricao status);

}
