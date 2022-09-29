package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.dao.CursoDAO;
import br.com.xpto.plataforma.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("CursoImpl")
public class CursoServiceImpl implements ICursoService {
    @Autowired
    private CursoDAO dao;

    @Override
    public ArrayList<Curso> recuperarTodos() {
        return (ArrayList<Curso>) dao.findAll();
    }

    @Override
    public Curso recuperarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
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
    public Curso atualizarDados(Integer id, Curso novoCurso) {
        return dao.findById(id).map(curso -> {
        	curso.setEmpresa(novoCurso.getEmpresaId());
            curso.setStatusCurso(novoCurso.getStatusCurso());
            curso.setCargaHoraria(novoCurso.getCargaHoraria());
            curso.setDescricao(novoCurso.getDescricao());
            curso.setDataCriacao(novoCurso.getDataCriacao());
            curso.setDataFim(novoCurso.getDataFim());
            curso.setNome(novoCurso.getNome());
            curso.setDataInicio(novoCurso.getDataInicio());
            curso.setFimInscricao(novoCurso.getFimInscricao());
            curso.setInicioInscricao(novoCurso.getInicioInscricao());
            return dao.save(curso);
        }).orElse(null);
    }

    @Override
    public Curso buscarPorNome(String nome) {
        return null;
    }

}
