package com.bca.controller;

import com.bca.model.*;
import com.bca.service.BCAKafkaBridgeService;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.bca.BcaKafkaBridgeApiInfo.API_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

@RestController
@RequestMapping(path = API_PATH, produces = APPLICATION_JSON_VALUE)
public class BcaKafkaBridgeController {
    @Autowired
    private BCAKafkaBridgeService BCAKafkaBridgeService;

    @PostMapping(path = "/avaloq/ingest")
    @ResponseBody
    public ResponseEntity<Object> ingestAvaloqData(@RequestBody @Valid final AvaloqIngestRequest request) throws JsonProcessingException {
        BCAKafkaBridgeService.ingestAndProduce(request);

        // return the whole json request as response
        return new ResponseEntity<Object>(request, HttpStatus.CREATED);
    }

}
