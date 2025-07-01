package br.com.api.facade.egl.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class TempoResponseDTO {

    private String by;
    private Double executionTime;
    private Boolean fromCache;
    private ResultResponseDTO resultTemp;

}
