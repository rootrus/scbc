package com.thunderhead.android.infrastructure.server.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CreateTouchpointRequest implements Serializable {
    private static final long serialVersionUID = -6438414780439079322L;
    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("name")
    @Expose
    private String name;

    public CreateTouchpointRequest() {
    }

    public CreateTouchpointRequest(String str, String str2, String str3) {
        this.channel = str;
        this.name = str2;
        this.baseUrl = str3;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setBaseUrl(String str) {
        this.baseUrl = str;
    }
}
