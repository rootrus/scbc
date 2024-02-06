package com.thunderhead.android.infrastructure.server.requests;

public class AddNewDataAttributeRequest {
    private String absoluteName;
    private String alias;
    private String defaultValue;
    private String description;
    private int dynamic;
    private int enabled;
    private String name;
    private String type;

    public AddNewDataAttributeRequest() {
    }

    public AddNewDataAttributeRequest(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        this.alias = str;
        this.dynamic = i;
        this.enabled = i2;
        this.defaultValue = str2;
        this.type = str3;
        this.absoluteName = str4;
        this.name = str5;
        this.description = str6;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("alias:");
        sb.append(this.alias);
        sb.append(", dynamic:");
        sb.append(this.dynamic);
        sb.append(", enabled:");
        sb.append(this.enabled);
        sb.append(", defaultValue:");
        sb.append(this.defaultValue);
        sb.append(", type:");
        sb.append(this.type);
        sb.append(", absoluteName:");
        sb.append(this.absoluteName);
        sb.append(", name:");
        sb.append(this.name);
        sb.append(", description:");
        sb.append(this.description);
        return sb.toString();
    }
}
