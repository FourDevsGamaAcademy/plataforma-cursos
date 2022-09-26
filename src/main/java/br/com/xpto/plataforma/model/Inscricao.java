package br.com.xpto.plataforma.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "inscricao")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inscricao_id")
    private Integer inscricaoId;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "aluno_id") private Aluno aluno;
	 */

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "curso_id") private Curso curso;
	 */
    
	@Column(name = "aluno_id")
    private Integer alunoId;
    @Column (name = "curso_id")
    private Integer cursoId;

    
    @Column(name = "status_inscricao")
    @Enumerated(EnumType.STRING)
    private StatusInscricao statusInscricao;

    @Column(name = "data_aplicacao")
    private LocalDate dataAplicacao;

    public Integer getInscricaoId() {
        return inscricaoId;
    }

    public void setInscricaoId(Integer inscricaoId) {
        this.inscricaoId = inscricaoId;
    }

	/*
	 * public Aluno getAluno() { return aluno; }
	 * 
	 * public void setAluno(Aluno aluno) { this.aluno = aluno; }
	 */

    public StatusInscricao getStatusInscricao() {
        return statusInscricao;
    }

    public void setStatusInscricao(StatusInscricao statusInscricao) {
        this.statusInscricao = statusInscricao;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

	/*
	 * public Curso getCurso() { return curso; }
	 * 
	 * public void setCurso(Curso curso) { this.curso = curso; }
	 */
    
    public Integer getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Integer alunoId) {
		this.alunoId = alunoId;
	}
	
	public Integer getCursoId() {
		return cursoId;
	}

	public void setCursoId(Integer cursoId) {
		this.cursoId = cursoId;
	}
}
