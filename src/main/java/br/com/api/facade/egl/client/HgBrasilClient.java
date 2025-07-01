package br.com.api.facade.egl.client;

import br.com.api.facade.egl.config.FeignConfig;
import br.com.api.facade.egl.dtos.client.response.HgBrasilTempResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "HgBrasilClient", url = "${feign.api.hg-brasil.url}", configuration = FeignConfig.class)
public interface HgBrasilClient {

    @GetMapping("/weather")
    HgBrasilTempResponseDTO getTemp(@RequestParam("city_name") String cityName,
                                    @RequestParam("key") String key);
}
