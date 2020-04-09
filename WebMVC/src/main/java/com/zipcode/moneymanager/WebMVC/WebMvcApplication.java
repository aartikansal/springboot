package com.zipcode.moneymanager.WebMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@SpringBootApplication
public class WebMvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebMvcApplication.class, args);

	}



}
