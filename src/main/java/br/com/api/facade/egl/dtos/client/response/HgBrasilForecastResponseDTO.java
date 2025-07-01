package br.com.api.facade.egl.dtos.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class HgBrasilForecastResponseDTO {
  private String date;
  private String full_date;
  private String weekday;
  private Integer max;
  private Integer min;
  private Integer humidity;
  private Double cloudiness;
  private Double rain;
  private Integer rain_probabillity;
  private String wind_speedy;
  private String sunrise;
  private String sunset;
  private String moon_phase;
  private String description;
  private String condition;

}
