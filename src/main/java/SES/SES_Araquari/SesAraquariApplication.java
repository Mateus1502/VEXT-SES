package SES.SES_Araquari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EntityScan(basePackages = {"Entity"})
public class SesAraquariApplication {

	public static void main(String[] args) {
		SpringApplication.run(SesAraquariApplication.class, args);
	}

}
