package br.net.benfatto.jacares.dto;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Murilo Oliveira
 */
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class EstadoDTO {
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String uf;
}
