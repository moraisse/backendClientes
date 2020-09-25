package pt.com.smorais.clientes.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pt.com.smorais.clientes.backend.model.entity.Cliente;
import pt.com.smorais.clientes.backend.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository clienteRepository){
        return args -> {
          Cliente cliente = Cliente.builder().nif("000000000").nome("Antonio").build();
          clienteRepository.save(cliente);

        };


    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
