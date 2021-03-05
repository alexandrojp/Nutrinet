package com.bitware.nutrinet.api.repository;

import com.bitware.nutrinet.api.model.Client;
import com.bitware.nutrinet.api.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;

import java.util.Date;

@Order(1)
@Component
public class ClientBeforeConvertCallback implements BeforeConvertCallback<Client>, Ordered {

    @Autowired
    private SequenceGeneratorService sequenceGenerator;

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public Client onBeforeConvert(Client entity, String collection) {
        if (entity.getId() < 1) {
            entity.setId(sequenceGenerator.generateSequence(Client.SEQUENCE_NAME));
        }
        return entity;
    }
}
