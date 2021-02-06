package br.net.benfatto.jacares.repository;

import br.net.benfatto.jacares.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Murilo Oliveira
 */
@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
