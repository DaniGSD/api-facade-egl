package br.com.api.facade.egl.service.mapper;

import br.com.api.facade.egl.dtos.response.AlunoResponseDTO;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AlunoResponseDTOMapper {

  public static List<AlunoResponseDTO> mapToAlunoResponseDtoList(List<AlunoResponseDTO> alunoList) {
    if (alunoList == null) {
      return List.of();
    }
    return alunoList.stream()
        .map(AlunoResponseDTOMapper::mapToAlunoResponseDto)
        .toList();
  }

  public static AlunoResponseDTO mapToAlunoResponseDto(AlunoResponseDTO aluno) {
    return AlunoResponseDTO.builder()
        .id(aluno.getId())
        .nomeAluno(aluno.getNomeAluno())
        .email(aluno.getEmail())
        .dataNascimento(aluno.getDataNascimento())
        .build();
  }

}
