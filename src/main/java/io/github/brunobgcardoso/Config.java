package io.github.brunobgcardoso;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
@Development
public class Config {

    @Bean
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("Teste de ambiente de desenvolvimento");
        };
    }
}
