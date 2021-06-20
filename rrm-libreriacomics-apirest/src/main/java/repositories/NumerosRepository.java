package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Numero;


@Repository
public interface NumerosRepository extends JpaRepository<Numero, Long> {
	@Query(value = "select * from numeros n natural join colecciones order by fecha_adquisicion desc", nativeQuery = true)
	List<Numero> ultimosNumerosAdquiridos();
	
	@Query(value = "select * from numeros n natural join colecciones order by precio desc", nativeQuery = true)
	List<Numero> numerosMasCaros();

}
