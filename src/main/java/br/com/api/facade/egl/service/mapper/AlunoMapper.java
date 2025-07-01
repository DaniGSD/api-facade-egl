package br.com.api.facade.egl.service.mapper;

import br.com.api.facade.egl.dtos.request.CreateAlunoRequestDTO;
import br.com.api.facade.egl.dtos.request.UpdateAlunoRequestDTO;
import br.com.api.facade.egl.entities.Aluno;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AlunoMapper {

  public static Aluno mapToCreateAluno(CreateAlunoRequestDTO requestDTO) {
    return Aluno.builder()
        .nome(requestDTO.getNome())
        .email(requestDTO.getEmail())
        .dataNascimento(requestDTO.getDataNascimento())
        .build();
  }

  public static Aluno mapToUpdateAluno(UpdateAlunoRequestDTO requestDTO) {
    return Aluno.builder()
        .id(requestDTO.getId())
        .nome(requestDTO.getNome())
        .email(requestDTO.getEmail())
        .dataNascimento(requestDTO.getDataNascimento())
        .build();
  }

}
