package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.dao.AlunoDAO;
import br.com.xpto.plataforma.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoDAO dao;

    @Override
    public Aluno cadastrarNovoAluno(Aluno novo) {
        if (!novo.getNome().isEmpty() && !novo.getSobrenome().isEmpty() && !novo.getCpf().isEmpty() && !novo.getCelular().isEmpty()
                && !novo.getEndereco().isEmpty() && !novo.getEmail().isEmpty()) {
            return dao.save(novo);
        }
            return null;
    }

    @Override
    public Aluno atualizarDados(Aluno dados) {
        return null;
    }

    @Override
    public ArrayList<Aluno> buscarTodos() {
        return (ArrayList<Aluno>) dao.findAll();
    }

    @Override
    public Aluno buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Aluno buscarCpf(String cpf) {
        return null;
    }

    @Override
    public void excluirAluno(Integer id) {
        dao.deleteById(id);
    }
}
