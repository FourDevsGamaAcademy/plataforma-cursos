package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.dao.InscricaoDAO;
import br.com.xpto.plataforma.model.Inscricao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("InscricaoServiceImpl")
public class InscricaoServiceImpl implements IInscricaoService {
    @Autowired
    private InscricaoDAO dao;

    @Override
    public ArrayList<Inscricao> recuperarTodas() {
        return (ArrayList<Inscricao>) dao.findAll();
    }

    @Override
    public Inscricao recuperarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
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
    public Inscricao atualizarDados(Integer id, Inscricao novaInscricao) {
        return dao.findById(id).map(inscricao -> {
            inscricao.setAluno(novaInscricao.getAluno());
            inscricao.setStatusInscricao(novaInscricao.getStatusInscricao());
            inscricao.setCurso(novaInscricao.getCurso());
            inscricao.setDataAplicacao(novaInscricao.getDataAplicacao());
            return dao.save(inscricao);
        }).orElse(null);
    }

}
