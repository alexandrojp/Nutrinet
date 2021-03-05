package com.bitware.nutrinet.api.exception;

import com.bitware.nutrinet.api.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ClientExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ClientErrorResponse> handleException(ClientNotFoundException cnfe){
        ClientErrorResponse errorResponse = new ClientErrorResponse();
        errorResponse.setCveError(-1);
        errorResponse.setCveMessage(cnfe.getMessage());
        return new ResponseEntity<ClientErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ClientErrorResponse> handleException(Exception ex){
        ClientErrorResponse errorResponse = new ClientErrorResponse();
        errorResponse.setCveError(-1);
        errorResponse.setCveMessage(ex.getMessage());
        return new ResponseEntity<ClientErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
