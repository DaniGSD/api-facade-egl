package br.com.api.facade.egl.service.mapper;

import static java.util.stream.Collectors.toList;

import br.com.api.facade.egl.dtos.response.CursoResponseDTO;
import br.com.api.facade.egl.entities.Curso;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CursoResponseDtoMapper {

  public static List<CursoResponseDTO> mapToCursoResponseDtoList(List<Curso> cursoList){
    if (cursoList == null) {
      return new ArrayList<>();
    }

    return cursoList.stream()
        .map (CursoResponseDtoMapper::mapToCursoResponseDto)
        .collect(toList());

  }

  public static CursoResponseDTO mapToCursoResponseDto(Curso curso) {
    return CursoResponseDTO.builder()
        .id (curso.getId())
        .nomeCurso (curso.getNomeCurso())
        .nomeProfessor(curso.getNomeProfessor())
        .grau(curso.getGrau())
        .horaCriacao(curso.getHoraCriacao())
        .build();
  }
}
