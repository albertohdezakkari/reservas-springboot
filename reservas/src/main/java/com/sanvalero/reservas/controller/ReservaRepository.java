package com.sanvalero.reservas.controller;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sanvalero.reservas.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
	
	@Query(value = "Select r from Reserva r Where r.fechaIngreso>= :fechaIngresoRes "
			+ "		AND r.fechaSalida <= :fechaSalidaRes")
	public List<Reserva> find(@Param("fechaIngresoRes") Date fechaInicio, 
									@Param("fechaSalidaRes") Date fechaSal);
	
	/*, nativeQuery = true*/

}
