package com.thunderhead.android.infrastructure.server.entitys;

public class WorkspaceData {
    private double controlGroup;
    private CreatedBy createdBy;
    private String createdDate;

    /* renamed from: id */
    private String f3118id;
    private String name;
    private String siteKey;

    public WorkspaceData(String str, String str2, double d, String str3, String str4, CreatedBy createdBy2) {
        this.createdDate = str;
        this.siteKey = str2;
        this.controlGroup = d;
        this.name = str3;
        this.f3118id = str4;
        this.createdBy = createdBy2;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public double getControlGroup() {
        return this.controlGroup;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.f3118id;
    }

    public CreatedBy getCreatedBy() {
        return this.createdBy;
    }
}
