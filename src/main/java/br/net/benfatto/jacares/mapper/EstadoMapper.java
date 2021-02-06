package br.net.benfatto.jacares.mapper;

import br.net.benfatto.jacares.dto.EstadoDTO;
import br.net.benfatto.jacares.model.Estado;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author Murilo Oliveira
 */
@Component
public class EstadoMapper {
    private final ModelMapper mapper;

    public EstadoMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public EstadoDTO convertToDTO(Estado entity) {
        return this.mapper
                .typeMap(Estado.class, EstadoDTO.class)
                .addMapping(Estado::getSigla, EstadoDTO::setUf)
                .map(entity);
    }

    public Estado convertToEntity(EstadoDTO dto) {
        return this.mapper
                .typeMap(EstadoDTO.class, Estado.class)
                .addMapping(EstadoDTO::getUf, Estado::setSigla)
                .map(dto);
    }
}
