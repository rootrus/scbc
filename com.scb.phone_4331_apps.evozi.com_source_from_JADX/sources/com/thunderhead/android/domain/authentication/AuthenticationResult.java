package com.thunderhead.android.domain.authentication;

public abstract class AuthenticationResult {
    public abstract Integer code();

    public abstract Throwable error();

    public abstract AuthenticationAccessToken token();
}
