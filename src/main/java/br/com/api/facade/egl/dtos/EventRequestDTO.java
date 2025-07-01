package br.com.api.facade.egl.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @Builder)
public class EventRequestDTO {
    private String eventName;
    private String description;
    private LocalDateTime eventDate;
    private String city;
    private String uf;
    private String category;
}
