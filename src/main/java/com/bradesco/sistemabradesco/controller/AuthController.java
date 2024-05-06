package com.bradesco.sistemabradesco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradesco.sistemabradesco.models.Funcionario;
import com.bradesco.sistemabradesco.repository.FuncionarioRepository;
import com.bradesco.sistemabradesco.services.AuthServices;

@RestController
@RequestMapping("/acesso")
public class AuthController {
    @Autowired
    private AuthServices authService;

    @Autowired
    private FuncionarioRepository repository;

    
    @PostMapping("/login")
    public void acesso(@RequestBody String codigo){ //TESTE DO PQ TA DANDO ERRADO!!!
        Funcionario f = repository.findByCodigo(codigo);
        System.out.println(f);
    }

    //LOGICA DO FUNCIONAMENTO
    // public ResponseEntity<String> login(@RequestBody String codigoAcesso) {
    //     Boolean autenticado = authService.autenticarPorCodigoAcesso(codigoAcesso);
    //     if (autenticado) {
    //         return new ResponseEntity<>("Login bem-sucedido", HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>("Código de acesso inválido", HttpStatus.UNAUTHORIZED);
    //     }
    // }


    // login codigos = i025368 - a054867 - 1478578

   // TODO: Metodo de criação de funcionario diretamente na aplicação
}
