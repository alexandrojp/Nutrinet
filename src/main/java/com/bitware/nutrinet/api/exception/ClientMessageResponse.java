package com.bitware.nutrinet.api.exception;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@JsonPropertyOrder({ "data", "Cve_Error", "Cve_Mensaje"})
public class ClientMessageResponse extends Message{

    private Object data;

    private ClientMessageResponse() {
    }

    public ClientMessageResponse(Object data, String message, HttpStatus status) {
        super(status.value(), message);
        this.data = data;
    }
}
