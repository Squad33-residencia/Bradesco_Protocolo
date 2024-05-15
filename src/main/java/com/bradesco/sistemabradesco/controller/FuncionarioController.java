package com.bradesco.sistemabradesco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradesco.sistemabradesco.models.Funcionario;
import com.bradesco.sistemabradesco.repository.FuncionarioRepository;


@RestController
@RequestMapping("/api/acesso")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository repository;

    
    // login codigos = i025368 - i054867 - i147857
    //senha = 010203

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Funcionario funcionario) {
        String codigo = funcionario.getCodigo();
        String senha = funcionario.getSenha();

        funcionario = repository.findByCodigo(codigo);
        if (funcionario != null) {
            if (funcionario.getSenha().equals(senha)) {
                return new ResponseEntity<>("Acesso liberado", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Acesso negado - Dados inválidos", HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>("Acesso negado - Usuário não encontrado", HttpStatus.UNAUTHORIZED);
        }
    }
    
   







}//Class
