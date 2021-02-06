package br.net.benfatto.jacares.mapper;

import br.net.benfatto.jacares.dto.CreateMunicipioDTO;
import br.net.benfatto.jacares.dto.MunicipioDTO;
import br.net.benfatto.jacares.model.Estado;
import br.net.benfatto.jacares.model.Municipio;
import br.net.benfatto.jacares.service.EstadoService;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

/**
 * @author Murilo Oliveira
 */
@Component
public class MunicipioMapper {
    private final EstadoService estadoService;

    public MunicipioMapper(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    public Municipio mapToEntity(CreateMunicipioDTO dto) {
        Municipio municipio = new Municipio();

        if (dto.getUf() != null) {
            municipio.setEstado(this.estadoService.findByUF(dto.getUf()));
        }

        municipio.setNome(dto.getNome());

        return municipio;
    }

    public MunicipioDTO mapToDTO(Municipio entity) {
        MunicipioDTO dto = new MunicipioDTO();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());

        if (entity.getEstado() != null) {
            dto.setUf(entity.getEstado().getSigla());
        }

        return dto;
    }
}
