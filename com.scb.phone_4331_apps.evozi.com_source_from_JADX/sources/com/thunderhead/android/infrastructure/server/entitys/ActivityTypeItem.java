package com.thunderhead.android.infrastructure.server.entitys;

public class ActivityTypeItem {

    /* renamed from: id */
    private String f3106id = "";
    private String lifeCycleStageId;
    private String lifeCycleStageName;
    private String name = "";

    public String getName() {
        return this.name;
    }

    public String getLifeCycleStageName() {
        return this.lifeCycleStageName;
    }

    public String getLifeCycleStageId() {
        return this.lifeCycleStageId;
    }

    public String getId() {
        return this.f3106id;
    }

    public void setId(String str) {
        this.f3106id = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
