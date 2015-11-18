package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootExample2Application {

	@RequestMapping("/")
	String sayHello(){
		return "Hello World";
	}
    public static void main(String[] args) {
        SpringApplication.run(SpringBootExample2Application.class, args);
    }
}
