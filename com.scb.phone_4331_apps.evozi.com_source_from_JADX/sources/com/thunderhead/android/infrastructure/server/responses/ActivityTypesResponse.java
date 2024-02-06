package com.thunderhead.android.infrastructure.server.responses;

import com.thunderhead.android.infrastructure.server.entitys.ActivityTypeItem;
import com.thunderhead.android.infrastructure.server.entitys.Criteria;

public class ActivityTypesResponse {
    private String UContext;
    private ActivityTypeData data;
    private String message;
    private String messageI18nKey;
    private String messageI18nKeyParams;
    private int status;
    private boolean success;
    private String uuid;

    public int getStatus() {
        return this.status;
    }

    public String getMessageI18nKey() {
        return this.messageI18nKey;
    }

    public String getMessageI18nKeyParams() {
        return this.messageI18nKeyParams;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUContext() {
        return this.UContext;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public ActivityTypeData getData() {
        return this.data;
    }

    public static class ActivityTypeData {
        private Criteria criteria;
        private ActivityTypeItem[] items;

        public Criteria getCriteria() {
            return this.criteria;
        }

        public ActivityTypeItem[] getItems() {
            return this.items;
        }
    }
}
