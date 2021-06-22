package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.Numero;
import repositories.NumerosRepository;


@Service
public class NumerosService {

	@Autowired
	private NumerosRepository numerosRepository;

	@Transactional(readOnly = true)
	public List<Numero> findAll() {

		return numerosRepository.findAll();
	}

	@Transactional(readOnly = true)
	public List<Numero> ultimosNumerosAdquiridos() {

		return numerosRepository.ultimosNumerosAdquiridos();
	}

	@Transactional(readOnly = true)
	public List<Numero> numerosMasCaros() {

		return numerosRepository.numerosMasCaros();
	}
}
