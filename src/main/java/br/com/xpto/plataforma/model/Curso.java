package br.com.xpto.plataforma.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curso_id", nullable = false)
    private Integer cursoId;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao;

    @Column(name = "carga_horaria", nullable = false)
    private Integer cargaHoraria;

    @Column(name = "data_criacao", nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDate dataFim;

    @Column(name = "inicio_inscricao", nullable = false)
    private LocalDate inicioInscricao;

    @Column(name = "fim_inscricao", nullable = false)
    private LocalDate fimInscricao;

    @Column(columnDefinition = "enum('CADASTRADO', 'INICIADO', 'EM_ANDAMENTO', 'FINALIZADO')", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusCurso statusCurso;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @JsonIgnore
    public String getEmpresaNome() {
        return empresa.getNome();
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

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

    public LocalDate getInicioInscricao() {
        return inicioInscricao;
    }

    public void setInicioInscricao(LocalDate inicioInscricao) {
        this.inicioInscricao = inicioInscricao;
    }

    public LocalDate getFimInscricao() {
        return fimInscricao;
    }

    public void setFimInscricao(LocalDate fimInscricao) {
        this.fimInscricao = fimInscricao;
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

    public StatusCurso getStatusCurso() {
        return statusCurso;
    }

    public void setStatusCurso(StatusCurso statusCurso) {
        this.statusCurso = statusCurso;
    }
}
