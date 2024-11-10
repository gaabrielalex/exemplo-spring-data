package com.example.demo.service;

import com.example.demo.repository.PessoaRepository;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.model.Cliente;
import com.example.demo.model.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Optional<Cliente> buscarPorCpf(String cpf) {
        return clienteRepository.findByPessoaCpf(cpf);
    }

    public Cliente inserirCliente(Long pessoaId, String nome, String cpf, Date dataNascimento, String mae, Date dataDeCadastro, String status) {
        // Verifica se a pessoa já existe
        Pessoa pessoa = pessoaRepository.findById(pessoaId).orElse(null);

        if (pessoa == null) {
            // Se a pessoa não existir, cria uma nova pessoa
            pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setCpf(cpf);
            pessoa.setDataNascimento(dataNascimento);
            pessoa.setMae(mae);
            pessoa = pessoaRepository.save(pessoa);  // Salva a nova pessoa
        }

        // Agora cria o cliente, associando à pessoa
        Cliente cliente = new Cliente();
        cliente.setPessoa(pessoa);  // Associa a pessoa ao cliente
        cliente.setDataDeCadastro(dataDeCadastro);
        cliente.setStatus(status);

        // Salva o cliente no banco de dados
        return clienteRepository.save(cliente);
    }
}
