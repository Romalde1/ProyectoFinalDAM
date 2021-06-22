package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Numero;
import services.NumerosService;


@RestController
public class NumerosController {

	@Autowired
	NumerosService numerosService;

	@GetMapping("/")
	public ResponseEntity<List<Numero>> findAll() {

		return new ResponseEntity<List<Numero>>(numerosService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/numeros/ultimos")
	public ResponseEntity<List<Numero>> ultimosNumerosAdquiridos() {

		return new ResponseEntity<List<Numero>>(numerosService.ultimosNumerosAdquiridos(), HttpStatus.OK);
	}
	
	@GetMapping("/numeros/caros")
	public ResponseEntity<List<Numero>> numerosMasCaros() {
		return new ResponseEntity<List<Numero>>(numerosService.numerosMasCaros(), HttpStatus.OK);
	}
}
