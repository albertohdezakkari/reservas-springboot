package com.sanvalero.reservas.view;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanvalero.reservas.model.Cliente;
import com.sanvalero.reservas.services.ClienteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/cliente")
@Api(tags = "cliente")
public class ClienteResource {
private final ClienteService clienteService;
	
	public ClienteResource(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping
	@ApiOperation(value="Listar Cliente", 
				notes="Servicio para Listar nuevo cliente")
	@ApiResponses(value= {@ApiResponse(code=201, 
				message="Cliente Listado correctamente"),
				@ApiResponse(code=400, message="Solicitud inválida")
			})
	public ResponseEntity<List<Cliente>> findAll(){
		return ResponseEntity.ok(this.clienteService.findAll());
	}
}
