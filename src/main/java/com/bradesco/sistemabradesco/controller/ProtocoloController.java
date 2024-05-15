package com.bradesco.sistemabradesco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradesco.sistemabradesco.dto.ProtocoloDTO;
import com.bradesco.sistemabradesco.models.Protocolo;
import com.bradesco.sistemabradesco.repository.ProtocoloRepository;
import com.bradesco.sistemabradesco.services.ProtocoloService;

@RestController
@RequestMapping("/api/protocolo")
public class ProtocoloController {

  @Autowired
	private ProtocoloRepository repository;
	
	@Autowired
	private ProtocoloService protocoloService;



	@GetMapping("/lista")
	public List<Protocolo> listarProtocolos(){
		List<Protocolo> Protocolos = repository.findAll();
		return Protocolos;
	}
	
 	@GetMapping(value = "/{id}")
	public Protocolo findByCodigo(@PathVariable Integer codigo) {
		Protocolo result = repository.findByCodigo(codigo);
		return result;
 	}

	@GetMapping(value = "/numero/{numeroProtocolo}")
	public Protocolo findByNumeroProtocolo(@PathVariable Long numeroProtocolo) {
		Protocolo result = repository.findByNumeroProtocolo(numeroProtocolo);
		return result;
	}

    @PostMapping("/abrirProtocolo")
    public Protocolo abrirProtocolo(@RequestBody ProtocoloDTO protocoloDTO) {
        return protocoloService.abrirProtocolo(protocoloDTO);
    }







}
