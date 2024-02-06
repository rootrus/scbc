package com.thunderhead.android.domain.authentication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthenticationAccessToken {
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("expires_in")
    @Expose
    private Integer expiresIn;
    @SerializedName("jti")
    @Expose
    private String jti;
    @SerializedName("token_type")
    @Expose
    private String tokenType;

    public AuthenticationAccessToken() {
    }

    public AuthenticationAccessToken(String str, String str2, Integer num, String str3) {
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresIn = num;
        this.jti = str3;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String str) {
        this.tokenType = str;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    public void setExpiresIn(Integer num) {
        this.expiresIn = num;
    }

    public String getJti() {
        return this.jti;
    }

    public void setJti(String str) {
        this.jti = str;
    }
}
