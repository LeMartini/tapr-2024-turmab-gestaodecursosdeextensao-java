package br.univille.microservgestaocursosextensao.Solicitacoes.entity;

import java.time.LocalDate;
import java.util.UUID;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "solicitacaoBolsa", autoCreateContainer = true)
public class SolicitacaoBolsa {
    private UUID idSolicitacao;
    private UUID idProjeto;
    private LocalDate dataSolicitacao;
    private String statusSolicitacao;

    public UUID getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(UUID idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public UUID getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(UUID idProjeto) {
        this.idProjeto = idProjeto;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(String statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }
}
