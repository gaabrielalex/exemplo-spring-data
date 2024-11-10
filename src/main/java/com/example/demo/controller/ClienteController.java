package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.dto.ClienteDTO;
import com.example.demo.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cpf/{cpf}")
    public Optional<Cliente> buscarPorCpf(@PathVariable String cpf) {
        return clienteService.buscarPorCpf(cpf);
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody ClienteDTO clienteDTO) {
        // Cria ou cadastra o cliente e a pessoa (caso a pessoa não exista)
        return clienteService.inserirCliente(
                clienteDTO.getPessoaId(),
                clienteDTO.getNome(),
                clienteDTO.getCpf(),
                clienteDTO.getDataNascimento(),
                clienteDTO.getMae(),
                clienteDTO.getDataDeCadastro(),
                clienteDTO.getStatus()
        );
    }
}
