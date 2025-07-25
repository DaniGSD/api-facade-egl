package br.com.api.facade.egl.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class CreateCursoRequestDTO {

  private String nome;
  private String nomeProfessor;
  private String grau;
  private String horaCriacao;

}
