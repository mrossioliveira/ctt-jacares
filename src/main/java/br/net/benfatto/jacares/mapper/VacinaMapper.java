package br.net.benfatto.jacares.mapper;

import br.net.benfatto.jacares.dto.VacinaDTO;
import br.net.benfatto.jacares.model.Vacina;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author Murilo Oliveira
 */
@Component
public class VacinaMapper {
    private final ModelMapper modelMapper;

    public VacinaMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public VacinaDTO mapToDTO(Vacina entity) {
        return this.modelMapper.map(entity, VacinaDTO.class);
    }

    public Vacina mapToEntity(VacinaDTO dto) {
        return this.modelMapper.map(dto, Vacina.class);
    }
}
