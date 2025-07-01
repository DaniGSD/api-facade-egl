package br.com.api.facade.egl.dtos.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class JokeResponseDTO {
  private String id;
  private String value;
  private String url;
  private String createdAt;
  private String updateAt;
  private String iconUrl;

}
