package io.github.brunobgcardoso;

import io.github.brunobgcardoso.domain.entity.Cliente;
import io.github.brunobgcardoso.domain.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String HelloWorld(){
        return applicationName;
    }

    @Bean
    public CommandLineRunner init(@Autowired ClientesRepository repository){
        return args -> {
            repository.save(new Cliente("Bruno",0));
            repository.save(new Cliente("Cliente 2",  0));

            List<Cliente> all = repository.getAll();
            all.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
