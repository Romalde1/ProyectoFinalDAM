package rrm.libreriacomics.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rrm.libreriacomics.apirest.entities.Coleccion;

@Repository
public interface ColeccionesRepository extends JpaRepository<Coleccion, Long> {

}
