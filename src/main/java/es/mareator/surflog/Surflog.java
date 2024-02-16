package es.mareator.surflog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Surflog {

	public static void main(String[] args) {
		SpringApplication.run(Surflog.class, args);
		System.out.println("Iniciado >>>>>>>>>>> puerto 4000");
	}

}
