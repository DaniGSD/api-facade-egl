package br.com.api.facade.egl.dtos.client.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class CatAPIResponseDTO {

  private String id;
  private String url;
  private Integer width;
  private Integer height;

}
