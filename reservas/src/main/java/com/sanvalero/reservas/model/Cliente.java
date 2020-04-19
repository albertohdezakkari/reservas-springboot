package com.sanvalero.reservas.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE")
@NamedQuery(name = "Cliente.findByIdCliente", 
query ="Select c from Cliente c where c.idCliente = ?1")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;

	@Column(name="NAME", unique=true, length = 50, nullable = false)
	private String name;
	private String lastname;
	private String address;
	private String telephone;
	private String email;

	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;

	
	

}
