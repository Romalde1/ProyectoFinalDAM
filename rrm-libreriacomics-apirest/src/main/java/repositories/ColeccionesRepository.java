package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Coleccion;


@Repository
public interface ColeccionesRepository extends JpaRepository<Coleccion, Long> {

}
