package ie.atu.registrationm2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegistrationM2Application {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationM2Application.class, args);
    }

}
