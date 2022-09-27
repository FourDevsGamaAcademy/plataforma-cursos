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
        // buscar pelo cpf
        if (novo.getNome() != null && novo.getSobrenome() != null && novo.getCpf() != null && novo.getCelular() != null
                && novo.getEndereco() != null && novo.getEmail() != null){
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public ArrayList<Aluno> buscarTodos() {
        return (ArrayList<Aluno>) dao.findAll();
    }

    @Override
    public Aluno atualizarDados(Aluno dados) {
        if (dados.getAlunoId() != null && dados.getNome() != null && dados.getSobrenome() != null && dados.getCpf() != null && dados.getCelular() != null
                && dados.getEndereco() != null && dados.getEmail() != null){
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public void excluirAluno(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Aluno buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Aluno buscarCpf(String cpf) {
        Aluno aluno =  dao.findByCpf(cpf);
        if (aluno != null){
            return aluno;
        }
        return null;
    }
}
