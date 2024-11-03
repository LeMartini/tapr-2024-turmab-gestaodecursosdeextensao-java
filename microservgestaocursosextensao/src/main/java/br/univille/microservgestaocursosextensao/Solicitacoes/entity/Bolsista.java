package br.univille.microservgestaocursosextensao.Solicitacoes.entity;

import java.util.UUID;

public class Bolsista {

    private UUID idBolsista;
    private UUID idSolicitacao;
    private String nome;
    private String matricula;
    private String curso;
    private String statusMatricula;

    public UUID getIdBolsista() {
        return idBolsista;
    }

    public void setIdBolsista(UUID idBolsista) {
        this.idBolsista = idBolsista;
    }

    public UUID getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(UUID idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }
}
