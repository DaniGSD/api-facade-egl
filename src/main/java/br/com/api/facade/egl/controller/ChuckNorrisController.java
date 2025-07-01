package br.com.api.facade.egl.controller;


import br.com.api.facade.egl.dtos.response.JokeResponseDTO;
import br.com.api.facade.egl.service.ChuckNorrisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/chucknorris")
@RequiredArgsConstructor
public class ChuckNorrisController {

  private final ChuckNorrisService chuckNorrisService;

  @GetMapping
  public ResponseEntity<JokeResponseDTO> getJoke() {
    JokeResponseDTO response = chuckNorrisService.getRandomJoke();
    return ResponseEntity.ok(response);
  }

}
