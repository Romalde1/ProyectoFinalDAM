package rrm.libreriacomics.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rrm.libreriacomics.apirest.entities.Coleccion;
import rrm.libreriacomics.apirest.services.ColeccionesService;

@RestController
public class ColeccionesController {

	@Autowired
	ColeccionesService colService;

	@GetMapping("/colecciones")
	public ResponseEntity<List<Coleccion>> findAll() {

		return new ResponseEntity<List<Coleccion>>(colService.findAll(), HttpStatus.OK);
	}

}
