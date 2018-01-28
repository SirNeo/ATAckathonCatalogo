package es.jmpalma.atackathon.catalogo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan({"es.jmpalma.atackathon"})
public class MicroservicioCatalogoApplication {

	public static final Logger log = LoggerFactory.getLogger(MicroservicioCatalogoApplication.class.getName());
	
	public static void main(String[] args) {
		log.debug("MicroservicioCatalogoApplication :: main :: inicio");
		SpringApplication.run(MicroservicioCatalogoApplication.class, args);
	}
}
