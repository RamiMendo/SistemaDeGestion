package com.ramitax.exception;

import org.springframework.http.HttpStatus;

public class ArticuloException extends Exception{

    private String mensaje;
    private HttpStatus httpStatus;

    public ArticuloException(String mensaje, HttpStatus httpStatus) {
        super(mensaje);
        this.mensaje = mensaje;
        this.httpStatus = httpStatus;
    }


}
