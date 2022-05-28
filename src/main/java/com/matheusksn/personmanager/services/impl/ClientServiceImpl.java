    package com.matheusksn.personmanager.services.impl;

    import com.matheusksn.personmanager.entities.Client;
    import com.matheusksn.personmanager.repositories.CLientRepository;
    import com.matheusksn.personmanager.services.ClientService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class ClientServiceImpl implements ClientService {

        private final CLientRepository clientRepository;

        @Autowired
        public ClientServiceImpl(CLientRepository clientRepository) {
            this.clientRepository = clientRepository;
        }

        @Override
        public Client createClient(Client newClient) {

            var  createdClient = this.clientRepository.save(newClient);

            return createdClient;
        }
    }
