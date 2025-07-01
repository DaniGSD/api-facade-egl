package br.com.api.facade.egl.dtos.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class HgBrasilResultResponseDTO {

    private Integer temp;
    private String time;
    private Integer condition_code;
    private String description;
    private String currently;
    private String cid;
    private String city;
    private String img_id;
    private Integer humidity;
    private BigDecimal cloudiness;
    private BigDecimal rain;
    private String wind_speedy;
    private Integer wind_direction;
    private String wind_cardinal;
    private String sunrise;
    private String sunset;
    private String moon_phase;
    private String condition_slug;
    private String city_name;
    private String timezone;
    private String date;
    private List<HgBrasilForecastResponseDTO> forecast;

}
