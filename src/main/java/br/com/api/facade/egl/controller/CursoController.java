package br.com.api.facade.egl.controller;

import br.com.api.facade.egl.dtos.request.CreateCursoRequestDTO;
import br.com.api.facade.egl.dtos.request.UpdateCursoRequestDTO;
import br.com.api.facade.egl.dtos.response.CursoResponseDTO;
import br.com.api.facade.egl.service.CursoService;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cursos")
@RequiredArgsConstructor
public class CursoController {

  private final CursoService cursoService;

  @PostMapping
  public ResponseEntity<Void> saveCurso(@RequestBody CreateCursoRequestDTO requestDTO) {
    cursoService.saveCurso(requestDTO);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @PutMapping
  public ResponseEntity<String> updateCurso(@RequestBody UpdateCursoRequestDTO requestDTO) {
    String message = cursoService.updateCurso(requestDTO);
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(Collections.singletonMap("message", message).toString());
  }

  @GetMapping
  public ResponseEntity<List<CursoResponseDTO>> getCursos() {
    List<CursoResponseDTO> response = cursoService.getAllCursos();
    return ResponseEntity.ok(response);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CursoResponseDTO> getByIdCurso(@PathVariable Long id) {
    CursoResponseDTO response = cursoService.getByIdCurso(id);
    return ResponseEntity.ok(response);
  }

  @DeleteMapping("/{id}")
public ResponseEntity<String> deleteCurso(@PathVariable Long id){
    String message = cursoService.deleteCurso(id);
    return ResponseEntity.status(HttpStatus.OK)
        .body(Collections.singletonMap("message", message).toString());

  }

}
