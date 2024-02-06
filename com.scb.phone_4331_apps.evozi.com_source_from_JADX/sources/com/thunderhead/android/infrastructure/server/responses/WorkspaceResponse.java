package com.thunderhead.android.infrastructure.server.responses;

import com.thunderhead.android.infrastructure.server.entitys.WorkspaceData;

public class WorkspaceResponse {
    private String UContext;
    private WorkspaceData[] data;
    private String message;
    private String messageI18nKey;
    private String messageI18nKeyParams;
    private int status;
    private boolean success;
    private String uuid;

    public WorkspaceResponse(boolean z, String str, String str2, String str3, String str4, int i, String str5, WorkspaceData[] workspaceDataArr) {
        this.success = z;
        this.messageI18nKey = str;
        this.messageI18nKeyParams = str2;
        this.uuid = str3;
        this.message = str4;
        this.status = i;
        this.UContext = str5;
        this.data = workspaceDataArr;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessageI18nKey() {
        return this.messageI18nKey;
    }

    public String getMessageI18nKeyParams() {
        return this.messageI18nKeyParams;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus() {
        return this.status;
    }

    public String getUContext() {
        return this.UContext;
    }

    public WorkspaceData[] getData() {
        return this.data;
    }
}
