package com.bitware.nutrinet.api.repository;

import com.bitware.nutrinet.api.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, Integer> {
}
