package br.com.api.facade.egl.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class WeekTempResponseDTO {
  private String date;
  private String fullDate;
  private String weekDay;
  private Integer max;
  private Integer min;
  private Integer humidity;
  private Double cloudiness;
  private Double rain;
  private Integer rainProbabillity;
  private String windSpeedy;
  private String sunrise;
  private String sunset;
  private String moonPhase;
  private String description;
  private String condition;

}
