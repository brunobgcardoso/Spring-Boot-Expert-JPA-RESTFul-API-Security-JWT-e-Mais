package io.github.brunobgcardoso.service;

import io.github.brunobgcardoso.model.Cliente;
import io.github.brunobgcardoso.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.register(cliente);

    }

    public void validarCliente(Cliente cliente){
        //aplica validações no cliente
    }
}
