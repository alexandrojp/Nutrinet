package com.bitware.nutrinet.api.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Message {

    @JsonProperty("Cve_Error")
    private int cveError;

    @JsonProperty("Cve_Mensaje")
    private String cveMessage;

    public Message() {}

    public Message(int cveError, String cveMessage) {
        this.cveError = cveError;
        this.cveMessage = cveMessage;
    }
}
