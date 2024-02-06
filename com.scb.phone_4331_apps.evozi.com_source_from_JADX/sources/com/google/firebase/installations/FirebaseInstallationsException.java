package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    private final Status status;

    public enum Status {
        BAD_CONFIG
    }

    public FirebaseInstallationsException(Status status2) {
        this.status = status2;
    }
}
