package rrm.libreriacomics.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rrm.libreriacomics.apirest.entities.Coleccion;
import rrm.libreriacomics.apirest.repositories.ColeccionesRepository;

@Service
public class ColeccionesService {

	@Autowired
	private ColeccionesRepository coleccionesRepository;

	public List<Coleccion> findAll() {

		return coleccionesRepository.findAll();
	}

}
