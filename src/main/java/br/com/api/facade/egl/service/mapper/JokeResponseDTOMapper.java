package br.com.api.facade.egl.service.mapper;


import br.com.api.facade.egl.dtos.client.response.ChuckNorrisJokeResponseDTO;
import br.com.api.facade.egl.dtos.response.JokeResponseDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JokeResponseDTOMapper {

  public static JokeResponseDTO mapToJokeResponseDTO(ChuckNorrisJokeResponseDTO response) {
    return JokeResponseDTO.builder()
        .id(response.getId())
        .value(response.getValue())
        .url(response.getUrl())
        .createdAt(response.getCreated_at())
        .updateAt(response.getUpdated_at())
        .iconUrl(response.getIcon_url())
        .build();
  }

}
