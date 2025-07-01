package br.com.api.facade.egl.dtos.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class HgBrasilTempResponseDTO {

    private String by;
    private Double execution_time;
    private Boolean from_cache;
    private HgBrasilResultResponseDTO results;

}
