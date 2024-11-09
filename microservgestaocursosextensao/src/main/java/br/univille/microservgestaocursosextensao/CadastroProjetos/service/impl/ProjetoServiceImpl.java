package br.univille.microservgestaocursosextensao.CadastroProjetos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;
import br.univille.microservgestaocursosextensao.CadastroProjetos.repository.ProjetoRepository;
import br.univille.microservgestaocursosextensao.CadastroProjetos.service.ProjetoService;


@Service
public class ProjetoServiceImpl {

    @Autowired
    private ProjetoRepository repository;
    
    @Override
    public List<Projeto> getAll() {
        var retornoIterador = repository.findAll();
        var listaProjeto = new ArrayList<Projeto>();
        
        retornoIterador.forEach(listaProjeto::add);
        return listaProjeto;
    }

    @Override
    public Projeto save(Projeto projeto) {
        return repository.save(projeto);
    }
    
}
