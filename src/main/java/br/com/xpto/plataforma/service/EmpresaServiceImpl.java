package br.com.xpto.plataforma.service;

import br.com.xpto.plataforma.dao.EmpresaDAO;
import br.com.xpto.plataforma.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private EmpresaDAO dao;

    @Override
    public Empresa criarNova(Empresa nova) {
        if (nova.getNome()!= null){
            return dao.save(nova);
        }
        return null;
    }

    @Override
    public Empresa atualizarDados(Empresa dados) {
        if(dados.getEmpresaId()!=null && dados.getNome() != null && dados.getCnpj() != null
                && dados.getEndereco() != null && dados.getResponsavel() != null
                && dados.getEmail() != null && dados.getTelefone() != null){
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public ArrayList<Empresa> buscarTodas() {
      return (ArrayList<Empresa>) dao.findAll();
    }

    @Override
    public Empresa buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Empresa buscarPorNome(String nome) {
        return null;
    }

    @Override
    public void excluirEmpresa(Integer id) {
        dao.deleteById(id);
    }


}
