package com.scb.phone.domain.entity.isprint;

public class E2EEEncryptionException extends Exception {
    public E2EEEncryptionException() {
        super("Encrypting PIN error!");
    }
}
