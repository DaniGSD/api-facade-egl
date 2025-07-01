package br.com.api.facade.egl.service;

import br.com.api.facade.egl.client.HgBrasilClient;
import br.com.api.facade.egl.dtos.client.response.HgBrasilTempResponseDTO;
import br.com.api.facade.egl.dtos.response.TempoResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.api.facade.egl.service.mapper.TempoResponseDTOMapper.mapToTempoResponseDTO;

@Service
@RequiredArgsConstructor
public class HgBrasilService {
    private static final String SUA_CHAVE = "SUA-CHAVE";
    private final HgBrasilClient hgbrasilclient;

    public TempoResponseDTO getTemp(String cityName) {
        HgBrasilTempResponseDTO response = hgbrasilclient.getTemp(cityName, SUA_CHAVE);
        return mapToTempoResponseDTO(response);
    }
}
