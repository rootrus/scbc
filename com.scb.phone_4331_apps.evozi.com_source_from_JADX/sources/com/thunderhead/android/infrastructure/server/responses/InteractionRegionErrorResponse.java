package com.thunderhead.android.infrastructure.server.responses;

import com.thunderhead.android.infrastructure.server.entitys.InteractionData;
import java.util.Arrays;

public class InteractionRegionErrorResponse {
    public InteractionData data;
    public String message;
    public String messageI18nKey;
    public Object[] messageI18nKeyParams;
    public int status;
    public boolean success;
    public String uuid;

    public String getMessageI18nKey() {
        return this.messageI18nKey;
    }

    public void setMessageI18nKey(String str) {
        this.messageI18nKey = str;
    }

    public Object[] getMessageI18nKeyParams() {
        return this.messageI18nKeyParams;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InteractionRegionErrorResponse{status=");
        sb.append(this.status);
        sb.append(", messageI18nKey='");
        sb.append(this.messageI18nKey);
        sb.append('\'');
        sb.append(", messageI18nKeyParams=");
        sb.append(Arrays.toString(this.messageI18nKeyParams));
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", uuid='");
        sb.append(this.uuid);
        sb.append('\'');
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
