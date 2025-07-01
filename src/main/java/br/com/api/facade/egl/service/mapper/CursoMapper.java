package br.com.api.facade.egl.service.mapper;

import br.com.api.facade.egl.dtos.request.CreateCursoRequestDTO;
import br.com.api.facade.egl.dtos.request.UpdateCursoRequestDTO;
import br.com.api.facade.egl.entities.Curso;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CursoMapper {

  public static Curso mapToCreateCurso(CreateCursoRequestDTO requestDTO){
    return Curso.builder()
        .nomeCurso(requestDTO.getNome())
        .nomeProfessor((requestDTO.getNomeProfessor()))
        .grau(requestDTO.getGrau())
        .horaCriacao((requestDTO.getHoraCriacao()))
        .build();
  }

  public static Curso mapToUpdateCurso(UpdateCursoRequestDTO requestDTO){
    return Curso.builder()
        .id(requestDTO.getId())
        .nomeCurso(requestDTO.getNome())
        .nomeProfessor((requestDTO.getNomeProfessor()))
        .grau(requestDTO.getGrau())
        .horaCriacao((requestDTO.getHoraCriacao()))
        .build();
  }

}
