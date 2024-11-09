package br.univille.microservgestaocursosextensao.CadastroProjetos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;
import br.univille.microservgestaocursosextensao.CadastroProjetos.service.ProjetoService;

@RestController
@RequestMapping("/api/v1/projeto")
public class ProjetoAPIController {

    @Autowired
    private ProjetoService service;

    @GetMapping
    public ResponseEntity<List<Projeto>> get(){
        var listaProjetos = service.getAll();

        return new ResponseEntity<List<Projetos>>(listaProjetos, HttpStatus.OK);
    }

    
}
