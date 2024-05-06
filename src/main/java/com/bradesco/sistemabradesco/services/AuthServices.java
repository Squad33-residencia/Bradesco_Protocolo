package com.bradesco.sistemabradesco.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bradesco.sistemabradesco.models.Funcionario;
import com.bradesco.sistemabradesco.repository.FuncionarioRepository;

@Service
public class AuthServices {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public boolean autenticarPorCodigoAcesso(String codigo) {
        Funcionario funcionario = funcionarioRepository.findByCodigo(codigo);
        if (funcionario!= null) {
            return true;
        }
        return false;
    }


}
