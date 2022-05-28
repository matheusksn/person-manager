package com.matheusksn.personmanager.repositories;

import com.matheusksn.personmanager.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CLientRepository extends MongoRepository<Client, UUID> {
}
