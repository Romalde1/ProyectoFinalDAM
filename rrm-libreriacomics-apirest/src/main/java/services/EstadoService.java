package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Estado;
import repositories.EstadoRepository;


@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	@Transactional
	public List<Estado> findAll() {

		return estadoRepository.findAll();
	}
}
