package br.net.benfatto.jacares.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Murilo Oliveira
 */
@NoArgsConstructor
@Getter
@Setter
public class MunicipioDTO {
    private Long id;
    private String nome;
    private String uf;
}
