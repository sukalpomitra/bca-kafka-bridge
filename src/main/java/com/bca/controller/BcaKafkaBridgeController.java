package com.bca.controller;

import com.bca.model.*;
import com.bca.service.BCAKafkaBridgeService;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.bca.BcaKafkaBridgeApiInfo.API_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(path = API_PATH, produces = APPLICATION_JSON_VALUE)
public class BcaKafkaBridgeController {
    @Autowired
    private BCAKafkaBridgeService BCAKafkaBridgeService;

    @PostMapping(path = "/avaloq/ingest")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    void ingestAvaloqData(@RequestBody final AvaloqIngestRequest request) throws JsonProcessingException {
         BCAKafkaBridgeService.ingestAndProduce(request);
    }

}
