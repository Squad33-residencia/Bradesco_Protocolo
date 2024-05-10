package com.bradesco.sistemabradesco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradesco.sistemabradesco.dto.CanaisDTO;
import com.bradesco.sistemabradesco.models.Canais;
import com.bradesco.sistemabradesco.services.CanaisService;


@RestController
@RequestMapping("/canais")
public class CanaisController {
    
    @Autowired
    private CanaisService canaisService;

    @GetMapping("/listar")
    public List<Canais> listarCanais() {
        return canaisService.listarCanais();
    }

    @PostMapping("/criar")
    public Canais criarCanal(@RequestBody CanaisDTO canaisDTO) {
        return canaisService.criarCanal(canaisDTO);
    }
}