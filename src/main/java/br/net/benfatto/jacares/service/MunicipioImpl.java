package br.net.benfatto.jacares.service;

import br.net.benfatto.jacares.model.Municipio;
import br.net.benfatto.jacares.repository.MunicipioRepository;
import org.springframework.stereotype.Service;

/**
 * @author Murilo Oliveira
 */
@Service
public class MunicipioImpl extends BaseServiceImpl<Municipio, Long> implements MunicipioService {
    public MunicipioImpl(MunicipioRepository repository) {
        super(repository);
    }
}
