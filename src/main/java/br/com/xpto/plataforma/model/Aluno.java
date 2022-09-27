package br.com.xpto.plataforma.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aluno_id", nullable = false)
    private Integer alunoId; //primary key

    @Column(name = "nome", length = 20, nullable = false)
    private String nome;

    @Column(name = "sobrenome", length = 30, nullable = false)
    private String sobrenome;

    @Column(name = "cpf", length = 15, unique = true, nullable = false)
    private String cpf;

    @Column(name = "data_nasc")
    private LocalDate dataNasc;

    @Column(columnDefinition = "enum('FEMININO','MASCULINO')")
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(name = "celular", length = 20, nullable = false)
    private String celular;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "email", length = 45, unique = true, nullable = false)
    private String email;

    @Column(name = "endereco", length = 120, nullable = false)
    private String endereco;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("aluno")
    private List<Inscricao> inscricao;

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
