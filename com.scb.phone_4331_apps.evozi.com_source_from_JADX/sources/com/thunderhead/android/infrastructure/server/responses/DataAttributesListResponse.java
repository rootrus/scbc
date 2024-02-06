package com.thunderhead.android.infrastructure.server.responses;

import com.thunderhead.android.infrastructure.server.entitys.AttributesListData;

public class DataAttributesListResponse {
    private String UContext;
    AttributesListData data;
    private String message;
    private String messageI18nKey;
    private String messageI18nKeyParams;
    private int status;
    private String success;
    private String uuid;

    public AttributesListData getData() {
        return this.data;
    }
}
