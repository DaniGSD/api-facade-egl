package br.com.api.facade.egl.dtos.client.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class ChuckNorrisJokeResponseDTO {
    private String id;
    private String value;
    private String url;
    private String created_at;
    private String updated_at;
    private String icon_url;
}
