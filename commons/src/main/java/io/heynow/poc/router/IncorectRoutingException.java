package io.heynow.poc.router;

public class IncorectRoutingException extends RuntimeException {
    public IncorectRoutingException(String msg) {
        super(msg);
    }

}
