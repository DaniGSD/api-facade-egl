package br.com.api.facade.egl.client;


import br.com.api.facade.egl.config.FeignConfig;
import br.com.api.facade.egl.dtos.client.response.CatAPIResponseDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "TheCatAPI", url = "${feign.api.thecatapi.url}", configuration = FeignConfig.class)
public interface TheCatAPI {

 @GetMapping("/v1/images/search")
 List<CatAPIResponseDTO>  getCats(@RequestParam("limit") Integer limit);


}
