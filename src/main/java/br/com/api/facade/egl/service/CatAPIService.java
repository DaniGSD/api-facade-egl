package br.com.api.facade.egl.service;


import static br.com.api.facade.egl.service.mapper.CatResponseDTOmapper.mapToCatResponseDTOList;

import br.com.api.facade.egl.client.TheCatAPI;
import br.com.api.facade.egl.dtos.client.response.CatAPIResponseDTO;
import br.com.api.facade.egl.dtos.response.CatResponseDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatAPIService {
  private final TheCatAPI theCatAPI;

  public List<CatResponseDTO> getCats(Integer limit) {
    List<CatAPIResponseDTO> catResponseDTO = theCatAPI.getCats(limit);
    return mapToCatResponseDTOList(catResponseDTO);
  }
}
