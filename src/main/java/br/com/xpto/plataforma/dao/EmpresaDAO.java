package br.com.xpto.plataforma.dao;

import br.com.xpto.plataforma.model.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaDAO extends CrudRepository <Empresa, Integer> {
}
