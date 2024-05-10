package com.bradesco.sistemabradesco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradesco.sistemabradesco.models.Funcionario;
import com.bradesco.sistemabradesco.repository.FuncionarioRepository;


@RestController
@RequestMapping("/api/acesso")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository repository;

    
    //ACESSO APENAS COM O CODIGO DO USUARIO
    // @GetMapping("/usuario/{codigo}")
    // public ResponseEntity<String> getFuncionarioByCodigo(@PathVariable String codigo) {
    //     Funcionario funcionario = repository.findByCodigo(codigo);
    //     if (funcionario != null) {
    //         return new ResponseEntity<>("Acesso liberado", HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>("Acesso negado",HttpStatus.UNAUTHORIZED);
    //     }
    // }


    @GetMapping("/usuario/{codigo}/senha/{senha}") // -- METODO DE LOGIN DE UM FUNCIONARIO
    public ResponseEntity<String> getFuncionarioByCodigo(@PathVariable String codigo,@PathVariable String senha) {
        Funcionario funcionario = repository.findByCodigo(codigo);
        if (funcionario != null) {
            if (funcionario.getSenha().equals(senha)) {
                return new ResponseEntity<>("Acesso liberado", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Acesso negado - Senha incorreta", HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>("Acesso negado - Usuário não encontrado", HttpStatus.UNAUTHORIZED);
        }
    } // teste : http://localhost:8080/api/acesso/usuario/i054867/senha/010203
    // login codigos = i025368 - i054867 - i147857
    //senha = 010203

    
   // TODO: Metodo de criação de funcionario diretamente na aplicação







}//Class
