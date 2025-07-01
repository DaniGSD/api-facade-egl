package br.com.api.facade.egl.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class UpdateAlunoRequestDTO {

  private Long id;
  private String nome;
  private String email;
  private String dataNascimento;

}
