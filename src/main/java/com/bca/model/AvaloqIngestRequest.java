package com.bca.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class AvaloqIngestRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String transactionType;
    private DataModel data;

    public AvaloqIngestRequest() {
    }

    public AvaloqIngestRequest(DataModel data, String transactionType) {
        this.data = data;
        this.transactionType = transactionType;
    }

    @JsonProperty("data")
    @Valid
    public DataModel getData() {
        return data;
    }

    @JsonProperty("transaction_type")
    @NotBlank(message = "Transaction Type must not be blank")
    public String getTransactionType() {
        return transactionType;
    }
}
