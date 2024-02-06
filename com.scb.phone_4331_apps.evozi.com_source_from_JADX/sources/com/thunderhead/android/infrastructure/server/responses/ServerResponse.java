package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public abstract class ServerResponse implements Serializable {
    private static final long serialVersionUID = 2245936416854772693L;
    @SerializedName("UContext")
    @Expose
    private String UContext;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("messageI18nKey")
    @Expose
    private String messageI18nKey;
    @SerializedName("messageI18nKeyParams")
    @Expose
    private String messageI18nKeyParams;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("uuid")
    @Expose
    private String uuid;

    public String getMessageI18nKey() {
        return this.messageI18nKey;
    }

    public void setMessageI18nKey(String str) {
        this.messageI18nKey = str;
    }

    public String getMessageI18nKeyParams() {
        return this.messageI18nKeyParams;
    }

    public void setMessageI18nKeyParams(String str) {
        this.messageI18nKeyParams = str;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public String getUContext() {
        return this.UContext;
    }

    public void setUContext(String str) {
        this.UContext = str;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServerResponse{success=");
        sb.append(this.success);
        sb.append(", messageI18nKey='");
        sb.append(this.messageI18nKey);
        sb.append('\'');
        sb.append(", messageI18nKeyParams='");
        sb.append(this.messageI18nKeyParams);
        sb.append('\'');
        sb.append(", uuid='");
        sb.append(this.uuid);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", UContext='");
        sb.append(this.UContext);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
