package rrm.libreriacomics.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rrm.libreriacomics.apirest.entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
