package br.univille.microservgestaocursosextensao.CadastroProjetos.entity;

import java.time.LocalDate;

public class StatusProjeto {
    private String idEtapa;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String status;

    public String getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(String idEtapa) {
        this.idEtapa = idEtapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
