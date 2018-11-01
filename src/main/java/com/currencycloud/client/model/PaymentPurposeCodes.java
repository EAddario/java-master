package com.currencycloud.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

/* ToDo: Remove unused class */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentPurposeCodes {
    @JsonProperty("purpose_codes")
    private List<PaymentPurposeCode> purposeCodes;

    public List<PaymentPurposeCode> getPurposeCodes() {
        return purposeCodes;
    }

    @Override
    public String toString() {
        return String.format("{\"purpose_codes\":%s}", purposeCodes);
    }
}
