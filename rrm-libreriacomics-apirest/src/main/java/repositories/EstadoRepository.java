package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
