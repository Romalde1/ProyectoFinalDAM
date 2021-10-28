package rrm.libreriacomics.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rrm.libreriacomics.apirest.entities.Estado;
import rrm.libreriacomics.apirest.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAll() {

		return estadoRepository.findAll();
	}
}
