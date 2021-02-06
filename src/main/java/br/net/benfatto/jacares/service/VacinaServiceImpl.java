package br.net.benfatto.jacares.service;

import br.net.benfatto.jacares.model.Vacina;
import br.net.benfatto.jacares.repository.VacinaRepository;
import org.springframework.stereotype.Service;

/**
 * @author Murilo Oliveira
 */
@Service
public class VacinaServiceImpl extends BaseServiceImpl<Vacina, Long> implements VacinaService {
    public VacinaServiceImpl(VacinaRepository repository) {
        super(repository);
    }
}
