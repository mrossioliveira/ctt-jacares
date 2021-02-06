package br.net.benfatto.jacares.service;

import br.net.benfatto.jacares.model.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Murilo Oliveira
 */
@SpringBootTest
class EstadoServiceImplTest {

    @Autowired
    EstadoService estadoService;

    @Test
    void whenCreate_shouldHaveOneState() {
        Estado estado = new Estado();
        estado.setNome("São Paulo");
        estado.setSigla("SP");
        Estado created = this.estadoService.create(estado);

        assertThat(created.getNome()).isEqualTo("São Paulo");
    }

}
