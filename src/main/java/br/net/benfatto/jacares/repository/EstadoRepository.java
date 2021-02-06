package br.net.benfatto.jacares.repository;

import br.net.benfatto.jacares.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Murilo Oliveira
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    Optional<Estado> findBySiglaEquals(String sigla);

}
