package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Coleccion;
import repositories.ColeccionesRepository;


@Service
public class ColeccionesService {

	@Autowired
	private ColeccionesRepository coleccionesRepository;

	@Transactional(readOnly = true)
	public List<Coleccion> findAll() {

		return coleccionesRepository.findAll();
	}

}
