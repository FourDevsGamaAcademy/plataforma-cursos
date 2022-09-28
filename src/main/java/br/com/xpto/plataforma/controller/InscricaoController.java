package br.com.xpto.plataforma.controller;

import br.com.xpto.plataforma.model.Inscricao;
import br.com.xpto.plataforma.service.IInscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class InscricaoController {
	@Autowired
	@Qualifier("InscricaoServiceImpl")
	private IInscricaoService service;
	
	//recuperar todos
	
	@GetMapping("/inscricoes")
	public ArrayList<Inscricao> recuperarTodoMundo(){ 
		return service.recuperarTodas(); 
	}

	//recuperar pelo ID
	@GetMapping("/inscricoes/{codigo}")
	public ResponseEntity<Inscricao> recuperarPeloId(@PathVariable Integer codigo){
		Inscricao res = service.recuperarPeloId(codigo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build();
	}
		
	//cadastrar
	@PostMapping("/inscricoes")
	public ResponseEntity<Inscricao> inserirNovoCurso(@RequestBody Inscricao novo){
		Inscricao res = service.cadastrarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
			}
		return ResponseEntity.badRequest().build();
	}
	//excluir
	@DeleteMapping("/inscricao/{id}")
	public ResponseEntity<Inscricao> excluirInscricao(@PathVariable Integer id){
		service.excluirInscricao(id);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping("/inscricao")
	public ResponseEntity<Inscricao> atualizarStatusInscricao(@RequestBody Inscricao status){
		Inscricao res = service.atualizarStatusInscricao(status);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}

}
