package br.net.benfatto.jacares.controller;

import br.net.benfatto.jacares.dto.CreateMunicipioDTO;
import br.net.benfatto.jacares.dto.MunicipioDTO;
import br.net.benfatto.jacares.mapper.MunicipioMapper;
import br.net.benfatto.jacares.model.Municipio;
import br.net.benfatto.jacares.service.MunicipioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Murilo Oliveira
 */
@RestController
@RequestMapping("/api/municipios")
public class MunicipioController {
    private final MunicipioService municipioService;
    private final MunicipioMapper municipioMapper;

    public MunicipioController(
            MunicipioService municipioService,
            MunicipioMapper municipioMapper) {
        this.municipioService = municipioService;
        this.municipioMapper = municipioMapper;
    }

    @PostMapping
    public ResponseEntity<MunicipioDTO> create(@RequestBody CreateMunicipioDTO dto) {
        Municipio municipio = this.municipioService.create(
                this.municipioMapper.mapToEntity(dto)
        );
        return new ResponseEntity<>(this.municipioMapper.mapToDTO(municipio), HttpStatus.CREATED);
    }

}
