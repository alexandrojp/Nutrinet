package com.bitware.nutrinet.api.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientErrorResponse {

    @JsonProperty("Cve_Error")
    private int cveError;

    @JsonProperty("Cve_Mensaje")
    private String cveMessage;

    public ClientErrorResponse() {}

    public ClientErrorResponse(int cveError, String cveMessage) {
        this.cveError = cveError;
        this.cveMessage = cveMessage;
    }
}
