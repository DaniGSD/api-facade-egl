package br.com.api.facade.egl.dtos.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class ResultResponseDTO {

    private Integer temp;
    private String time;
    private Integer conditionCode;
    private String description;
    private String currently;
    private String cid;
    private String city;
    private String imgId;
    private Integer humidity;
    private BigDecimal cloudiness;
    private BigDecimal rain;
    private String windSpeedy;
    private Integer windDirection;
    private String windCardinal;
    private String sunrise;
    private String sunset;
    private String moonPhase;
    private String conditionSlug;
    private String cityName;
    private String timezone;
    private String date;
    private List<WeekTempResponseDTO> weekTempResponseDTOList;

}
