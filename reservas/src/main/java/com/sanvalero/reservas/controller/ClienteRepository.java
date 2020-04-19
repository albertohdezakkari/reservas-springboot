package com.sanvalero.reservas.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanvalero.reservas.model.Cliente;

public interface ClienteRepository 
			 extends JpaRepository<Cliente, Integer>{
	
	/*Query Methods*/
    /*public List<Cliente> findByLastName(String lastname);*/
	public Cliente findByIdCliente (int idCliente);


}
