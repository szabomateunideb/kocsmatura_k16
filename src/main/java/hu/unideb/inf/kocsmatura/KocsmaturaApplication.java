package hu.unideb.inf.kocsmatura;

import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KocsmaturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KocsmaturaApplication.class, args);
	}

	@Bean
	ModelMapper modelMapper(){
		ModelMapper m = new ModelMapper();
		return m;
		//return new ModelMapper();
	}

}
