package com.sanvalero.reservas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="RESERVA")
public class Reserva {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReserva;
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	@Temporal(TemporalType.DATE)
	private Date fechaSalida;
	private int personas;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;

	
}
