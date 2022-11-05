package com.bca.service;

import com.bca.model.AvaloqIngestRequest;
import com.bca.producer.BcaKafkaProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BCAKafkaBridgeService {
    @Autowired
    private BcaKafkaProducer producer;

    public void ingestAndProduce(final AvaloqIngestRequest request) throws JsonProcessingException {
        producer.sendMessage(request);
    }
}
