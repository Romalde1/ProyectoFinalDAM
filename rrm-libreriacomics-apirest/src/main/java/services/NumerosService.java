package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Numero;
import repositories.NumerosRepository;


@Service
public class NumerosService {

	@Autowired
	private NumerosRepository numerosRepository;

	public List<Numero> findAll() {

		return numerosRepository.findAll();
	}

	public List<Numero> ultimosNumerosAdquiridos() {

		return numerosRepository.ultimosNumerosAdquiridos();
	}

	public List<Numero> numerosMasCaros() {

		return numerosRepository.numerosMasCaros();
	}
}
