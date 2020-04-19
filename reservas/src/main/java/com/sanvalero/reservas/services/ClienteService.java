package com.sanvalero.reservas.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanvalero.reservas.controller.ClienteRepository;
import com.sanvalero.reservas.model.Cliente;

/*Todos los métodos que no tenga anotación, no serán transaccionales*/

@Service
@Transactional(readOnly = true)
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}	
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	public Cliente findByIdCliente(int idCliente) {
		return this.clienteRepository.findByIdCliente(idCliente);
	}
	public List<Cliente> findAll() {
		return this.clienteRepository.findAll();
	}

	
}
