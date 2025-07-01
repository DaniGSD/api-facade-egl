package br.com.api.facade.egl.service;

import static br.com.api.facade.egl.service.mapper.JokeResponseDTOMapper.mapToJokeResponseDTO;

import br.com.api.facade.egl.client.ChuckNorrisInterface;
import br.com.api.facade.egl.dtos.client.response.ChuckNorrisJokeResponseDTO;
import br.com.api.facade.egl.dtos.response.JokeResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChuckNorrisService {

    private final ChuckNorrisInterface chuckNorrisInterface;

    public JokeResponseDTO getRandomJoke() {
      ChuckNorrisJokeResponseDTO chuckNorrisJokeResponseDTO = chuckNorrisInterface.getRandomJoke();
      return mapToJokeResponseDTO(chuckNorrisJokeResponseDTO);

    }
}
