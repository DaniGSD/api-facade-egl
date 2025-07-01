package br.com.api.facade.egl.controller;


import br.com.api.facade.egl.dtos.response.CatResponseDTO;
import br.com.api.facade.egl.service.CatAPIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cat")
@RequiredArgsConstructor
public class CatController {

  private final CatAPIService catAPIService;

  @GetMapping
  public ResponseEntity<List<CatResponseDTO>> getCats(@RequestParam("limit") Integer limit) {
    List<CatResponseDTO> response = catAPIService.getCats(limit);
    return ResponseEntity.ok(response);
  }

}
