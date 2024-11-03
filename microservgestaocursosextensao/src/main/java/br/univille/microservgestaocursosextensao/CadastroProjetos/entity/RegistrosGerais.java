package br.univille.microservgestaocursosextensao.CadastroProjetos.entity;

import java.time.LocalDateTime;

public class RegistrosGerais {

    private String idProjetoRegistros;
    private LocalDateTime datUltimaAtualizacao;
    private String descricaoRegistroString;

    public String getIdProjetoRegistros() {
        return idProjetoRegistros;
    }

    public void setIdProjetoRegistros(String idProjetoRegistros) {
        this.idProjetoRegistros = idProjetoRegistros;
    }

    public LocalDateTime getDatUltimaAtualizacao() {
        return datUltimaAtualizacao;
    }

    public void setDatUltimaAtualizacao(LocalDateTime datUltimaAtualizacao) {
        this.datUltimaAtualizacao = datUltimaAtualizacao;
    }

    public String getDescricaoRegistroString() {
        return descricaoRegistroString;
    }

    public void setDescricaoRegistroString(String descricaoRegistroString) {
        this.descricaoRegistroString = descricaoRegistroString;
    }
}