package ru.tatarinov.securityboot;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;


@SpringBootApplication
public class SecurityBootApplication {



    public static void main(String[] args) {
        SpringApplication.run(SecurityBootApplication.class, args);

    }

}
