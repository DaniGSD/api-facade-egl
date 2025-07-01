package br.com.api.facade.egl.service.mapper;


import br.com.api.facade.egl.dtos.client.response.CatAPIResponseDTO;
import br.com.api.facade.egl.dtos.response.CatResponseDTO;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CatResponseDTOmapper {
  public static List<CatResponseDTO> mapToCatResponseDTOList(List<CatAPIResponseDTO> responseDTOList){

    if (responseDTOList == null){
      return new ArrayList<>();
    }

    return responseDTOList.stream()
        .map(CatResponseDTOmapper::mapToCatResponseDTO)
        .toList();

  }

  public static CatResponseDTO mapToCatResponseDTO(CatAPIResponseDTO responseDTO){
    return CatResponseDTO.builder()
        .id(responseDTO.getId())
        .url(responseDTO.getUrl())
        .width(responseDTO.getWidth())
        .height(responseDTO.getHeight())
        .build();
  }

}
