package br.net.benfatto.jacares.repository;

import br.net.benfatto.jacares.model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Murilo Oliveira
 */
@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
}
