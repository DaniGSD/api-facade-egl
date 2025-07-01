package br.com.api.facade.egl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.com.api.facade.egl")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class EglApplication {

	public static void main(String[] args) {
		SpringApplication.run(EglApplication.class, args);
		// https://api.hgbrasil.com/weather?key=SUA-CHAVE&city_name=Campinas,SP
		// https://api.chucknorris.io/
		// https://api.thecatapi.com/v1/images/search?limit=10
	}

}
