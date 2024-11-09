package br.univille.microservgestaocursosextensao.CadastroProjetos.service;

import java.util.List;
import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;

    public class ProjetoService {
            public List<Projeto> getAll();
            Projeto save(Projeto projeto);
}
