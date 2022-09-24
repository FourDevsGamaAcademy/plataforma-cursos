package br.com.xpto.plataforma.model;

import javax.persistence.*;
import java.time.LocalDate;

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

    @Column(name = "data_nasc", nullable = false)
    private LocalDate dataNasc;

    @Column(name = "genero", nullable = false)
    private Genero genero;

    @Column(name = "celular", length = 15, nullable = false)
    private String celular;

    @Column(name = "telefone", length = 14)
    private String telefone;

    @Column(name = "email", length = 45, unique = true, nullable = false)
    private String email;

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
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

    @Column(name = "endereco", length = 120, nullable = false)



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
