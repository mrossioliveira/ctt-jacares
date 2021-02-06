package br.net.benfatto.jacares.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Murilo Oliveira
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class VacinaListDTO {
    private List<VacinaDTO> data;
    private int total;

    public VacinaListDTO(List<VacinaDTO> data) {
        this.data = data;
        this.total = data.size();
    }
}
