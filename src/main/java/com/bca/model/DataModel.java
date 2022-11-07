package com.bca.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class DataModel {
    private String cisNumber;
    private String referenceNumber;
    private String statusSidUt;
    private String descriptionStatusUt;
    private String statusSidFi;
    private String descriptionStatusFi;

    @JsonProperty("cis_number")
    @NotBlank(message = "CIS Number must not be blank")
    public String getCisNumber() {
        return cisNumber;
    }

    @JsonProperty("reference_number")
    @NotBlank(message = "Reference Number must not be blank")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    @JsonProperty("status_sid_ut")
    public String getStatusSidUt() {
        return statusSidUt;
    }

    @JsonProperty("description_status_ut")
    public String getDescriptionStatusUt() {
        return descriptionStatusUt;
    }

    @JsonProperty("status_sid_fi")
    public String getStatusSidFi() {
        return statusSidFi;
    }

    @JsonProperty("description_status_fi")
    public String getDescriptionStatusFi() {
        return descriptionStatusFi;
    }
}
