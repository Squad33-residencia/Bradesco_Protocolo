package com.bradesco.sistemabradesco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bradesco.sistemabradesco.dto.ProtocoloDTO;
import com.bradesco.sistemabradesco.models.Protocolo;
import com.bradesco.sistemabradesco.services.ProtocoloService;

@RequestMapping("/chamada")
@RestController
public class ProtocoloController {

    @Autowired
    private ProtocoloService protocoloService;

    @PostMapping("/protocolos")
    public Protocolo abrirProtocolo(@RequestBody ProtocoloDTO protocoloDTO) {
        return protocoloService.abrirProtocolo(protocoloDTO);
    }
}
