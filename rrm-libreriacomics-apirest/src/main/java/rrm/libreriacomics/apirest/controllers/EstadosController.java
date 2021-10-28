package rrm.libreriacomics.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rrm.libreriacomics.apirest.entities.Estado;
import rrm.libreriacomics.apirest.services.EstadoService;

@RestController
public class EstadosController {

	@Autowired
	EstadoService estadoService;

	@GetMapping("/estados")
	public ResponseEntity<List<Estado>> findAll() {

		return new ResponseEntity<List<Estado>>(estadoService.findAll(), HttpStatus.OK);
	}
}
