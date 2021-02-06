package br.net.benfatto.jacares.service;

import br.net.benfatto.jacares.model.Estado;
import br.net.benfatto.jacares.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

/**
 * @author Murilo Oliveira
 */
@Service
public class EstadoServiceImpl extends BaseServiceImpl<Estado, Long> implements EstadoService {
    private final EstadoRepository estadoRepository;

    public EstadoServiceImpl(EstadoRepository repository) {
        super(repository);
        this.estadoRepository = repository;
    }

    @Override
    public Estado findByUF(String uf) {
        return this.estadoRepository.findBySiglaEquals(uf)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format("Estado com UF %s não encontrado", uf)));
    }
}
