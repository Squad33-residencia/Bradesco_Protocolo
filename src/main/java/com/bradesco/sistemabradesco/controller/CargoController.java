package com.bradesco.sistemabradesco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradesco.sistemabradesco.dto.CargoDTO;
import com.bradesco.sistemabradesco.models.Cargo;
import com.bradesco.sistemabradesco.services.CargoService;


@RestController
@RequestMapping("/cargos")
public class CargoController {
    
    @Autowired
    private CargoService cargoService;

    @GetMapping("/listar")
    public List<Cargo> listarCargos() {
        return cargoService.listarCargos();
    }

    @PostMapping("/criar")
    public Cargo criarCargo(@RequestBody CargoDTO cargoDTO) {
        return cargoService.criarCargo(cargoDTO);
    }
}