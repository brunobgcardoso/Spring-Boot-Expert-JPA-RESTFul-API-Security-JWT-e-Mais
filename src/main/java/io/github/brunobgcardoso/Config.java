package io.github.brunobgcardoso;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class Config {

    @Bean
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("Teste de ambiente de desenvolvimento");
        };
    }
}
