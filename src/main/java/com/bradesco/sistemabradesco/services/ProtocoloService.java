package com.bradesco.sistemabradesco.services;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bradesco.sistemabradesco.dto.ProtocoloDTO;
import com.bradesco.sistemabradesco.models.Cliente;
import com.bradesco.sistemabradesco.models.Protocolo;
import com.bradesco.sistemabradesco.repository.ProtocoloRepository;

@Service
public class ProtocoloService {

    @Autowired
    private ProtocoloRepository protocoloRepository;

    public Protocolo abrirProtocolo(ProtocoloDTO protocoloDTO) {
        Protocolo protocolo = new Protocolo();
        Cliente cliente = new Cliente();
        
        // Copiar os dados do DTO para a entidade Cliente
        // cliente.setCodigo(protocoloDTO.getCodigo());
        // cliente.setCpf(protocoloDTO.getCpf());

        // Copiar os dados do DTO para a entidade Protocolo
        protocolo.setDataAbertura(LocalDate.now());
        protocolo.setDescricao(protocoloDTO.getDescricao());

        // Associar o cliente ao protocolo
        protocolo.setCliente(cliente);

        // Salvar o protocolo no banco de dados
        return protocoloRepository.save(protocolo);
    }
}