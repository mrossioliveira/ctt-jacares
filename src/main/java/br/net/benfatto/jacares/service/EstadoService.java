package br.net.benfatto.jacares.service;

import br.net.benfatto.jacares.model.Estado;

/**
 * @author Murilo Oliveira
 */
public interface EstadoService extends BaseService<Estado, Long> {

    Estado findByUF(String uf);

}
