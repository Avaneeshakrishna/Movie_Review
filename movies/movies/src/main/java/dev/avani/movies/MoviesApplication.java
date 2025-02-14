package dev.avani.movies;


import org.springframework.boot.SpringApplication; //contains run method
import org.springframework.boot.autoconfigure.SpringBootApplication; //annotation
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
		}

}
