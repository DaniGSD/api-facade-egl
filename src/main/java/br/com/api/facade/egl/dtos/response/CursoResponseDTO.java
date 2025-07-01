package br.com.api.facade.egl.dtos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor(onConstructor_ = @Builder)
public class CursoResponseDTO {

  private Long id;
  private String nomeCurso;
  private String nomeProfessor;
  private String grau;
  private String horaCriacao;
  private String mesage;

}
