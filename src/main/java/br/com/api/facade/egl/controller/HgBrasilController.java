package br.com.api.facade.egl.controller;

import br.com.api.facade.egl.dtos.response.TempoResponseDTO;
import br.com.api.facade.egl.service.HgBrasilService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/climate")
@RequiredArgsConstructor
public class HgBrasilController {

    private final HgBrasilService hgBrasilService;

    @GetMapping
    public ResponseEntity<TempoResponseDTO> getClimate(@RequestParam("cityName") String cityName) {
        TempoResponseDTO response = hgBrasilService.getTemp(cityName);
        return ResponseEntity.ok(response);
    }

}
