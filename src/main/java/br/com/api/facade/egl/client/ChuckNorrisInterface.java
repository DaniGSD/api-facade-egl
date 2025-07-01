package br.com.api.facade.egl.client;

import br.com.api.facade.egl.dtos.client.response.ChuckNorrisJokeResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ChuckNorrisClient", url = "${feign.api.chuck-norris.url}")
public interface ChuckNorrisInterface {

  @GetMapping("/jokes/random")
  ChuckNorrisJokeResponseDTO getRandomJoke();
}