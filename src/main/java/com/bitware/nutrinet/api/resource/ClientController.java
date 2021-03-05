package com.bitware.nutrinet.api.resource;

import com.bitware.nutrinet.api.exception.ClientNotFoundException;
import com.bitware.nutrinet.api.model.Client;
import com.bitware.nutrinet.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequestMapping("/Nutrinet")
@RestController
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @PostMapping("/Cliente")
    public Client saveClient(@RequestBody Client client) {
        return repository.save(client);
    }

    @GetMapping("/Cliente")
    public List<Client> listClient() {
        return repository.findAll();
    }

    @GetMapping("/Cliente/{id}")
    public Optional<Client> detailClient(@PathVariable() Integer id) {
        Optional<Client> client = repository.findById(id);
        if (!repository.findById(id).isPresent()) {
            throw new ClientNotFoundException("El cliente con ID: " + id + " no existe");
        }
        return repository.findById(id);
    }

    @PutMapping("/Cliente/{id}")
    public Optional<Client> updateClient(@PathVariable() Integer id, @RequestBody Client updatedClient) {
        if (!repository.findById(id).isPresent()) {
            throw new ClientNotFoundException("El cliente que se desea actualizar no existe");
        }

        return repository.findById(id).map(client -> {
            client.setAge(updatedClient.getAge());
            client.setHeight(updatedClient.getHeight());
            client.setBodyWeight(updatedClient.getBodyWeight());
            client.setGEB(updatedClient.getGEB());
            return repository.save(client);
        });
    }
}
