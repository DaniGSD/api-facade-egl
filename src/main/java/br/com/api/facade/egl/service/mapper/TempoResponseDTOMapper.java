package br.com.api.facade.egl.service.mapper;

import static java.util.stream.Collectors.toList;

import br.com.api.facade.egl.dtos.client.response.HgBrasilForecastResponseDTO;
import br.com.api.facade.egl.dtos.client.response.HgBrasilResultResponseDTO;
import br.com.api.facade.egl.dtos.client.response.HgBrasilTempResponseDTO;
import br.com.api.facade.egl.dtos.response.ResultResponseDTO;
import br.com.api.facade.egl.dtos.response.TempoResponseDTO;
import br.com.api.facade.egl.dtos.response.WeekTempResponseDTO;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TempoResponseDTOMapper {

  public static TempoResponseDTO mapToTempoResponseDTO(HgBrasilTempResponseDTO response) {
    return TempoResponseDTO.builder()
        .by(response.getBy())
        .executionTime(response.getExecution_time())
        .fromCache(response.getFrom_cache())
        .resultTemp(mapToResultResponseDTO(response.getResults()))
        .build();
  }

  public static ResultResponseDTO mapToResultResponseDTO(HgBrasilResultResponseDTO result) {
    return ResultResponseDTO.builder()
        .temp(result.getTemp())
        .time(result.getTime())
        .conditionCode(result.getCondition_code())
        .description(result.getDescription())
        .currently(result.getCurrently())
        .cid(result.getCid())
        .city(result.getCity())
        .imgId(result.getImg_id())
        .humidity(result.getHumidity())
        .cloudiness(result.getCloudiness())
        .rain(result.getRain())
        .windSpeedy(result.getWind_speedy())
        .windDirection(result.getWind_direction())
        .windCardinal(result.getWind_cardinal())
        .sunrise(result.getSunrise())
        .sunset(result.getSunset())
        .moonPhase(result.getMoon_phase())
        .conditionSlug(result.getCondition_slug())
        .cityName(result.getCity_name())
        .timezone(result.getTimezone())
        .date(result.getDate())
        .weekTempResponseDTOList(mapToWeekTempResponseDTOList(result.getForecast()))
        .build();
  }

  public static List<WeekTempResponseDTO> mapToWeekTempResponseDTOList(List<HgBrasilForecastResponseDTO> forecasts) {
    if (forecasts == null) {
      return new ArrayList<>();
    }

    return forecasts.stream()
        .map(TempoResponseDTOMapper::mapToWeekTempResponseDTO)
        .collect(toList());
  }

  public static WeekTempResponseDTO mapToWeekTempResponseDTO(HgBrasilForecastResponseDTO forecast) {
    return WeekTempResponseDTO.builder()
        .date(forecast.getDate())
        .fullDate(forecast.getFull_date())
        .weekDay(forecast.getWeekday())
        .max(forecast.getMax())
        .min(forecast.getMin())
        .humidity(forecast.getHumidity())
        .cloudiness(forecast.getCloudiness())
        .rain(forecast.getRain())
        .rainProbabillity(forecast.getRain_probabillity())
        .windSpeedy(forecast.getWind_speedy())
        .sunrise(forecast.getSunrise())
        .sunset(forecast.getSunset())
        .moonPhase(forecast.getMoon_phase())
        .description(forecast.getDescription())
        .condition(forecast.getCondition())
        .build();
  }

}
