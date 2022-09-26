package br.com.xpto.plataforma.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curso_id", nullable = false)
    private Integer cursoId;

	/* Tirar comentario para integracao
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "empresa_id") private Empresa empresa;
	 */

    //Tirar esse bloco ao conectar com a api da empresa
    @Column(name = "empresa_id", nullable = false)
    private Integer empresaId; 
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

	 @Column(name = "inicio_inscricao") 
	 private LocalDate inicioInscricao;
	 

    @Column(name = "fim_inscricao")
    private LocalDate fimInscricao;

	@Column(name = "status_curso") 
	@Enumerated(EnumType.STRING)
	private StatusCurso status_curso;
	

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

	/* Tirar comentario
	 * public Empresa getEmpresa() { return empresa; }
	 * 
	 * public void setEmpresa(Empresa empresa) { this.empresa = empresa; }
	 */
    
    //apagar a partir daqui
    public Integer getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Integer empresaId) {
		this.empresaId = empresaId;
	}
	//apagar ate aqui
	
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

	
	  public LocalDate getInicioInscricao() { return inicioInscricao; }
	  
	  public void setInicioInscricao(LocalDate inicioInscricao) {
	  this.inicioInscricao = inicioInscricao; }
	 

    public LocalDate getFimInscricao() {
        return fimInscricao;
    }

    public void setFimInscricao(LocalDate fimInscricao) {
        this.fimInscricao = fimInscricao;
    }	 

    public StatusCurso getStatus_curso() {
		return status_curso;
	}

	public void setStatus_curso(StatusCurso status_curso) {
		this.status_curso = status_curso;
	}

	public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
