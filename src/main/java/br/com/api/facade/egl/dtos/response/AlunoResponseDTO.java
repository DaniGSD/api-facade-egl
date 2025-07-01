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
public class AlunoResponseDTO {

  private Long id;
  private String nomeAluno;
  private String email;
  private String telefone;
  private String dataNascimento;
  private String horaCriacao;
  private String message;

}
