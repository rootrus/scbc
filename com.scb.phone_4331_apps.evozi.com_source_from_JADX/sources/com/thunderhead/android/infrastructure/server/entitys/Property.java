package com.thunderhead.android.infrastructure.server.entitys;

public class Property {
    public String name;
    public String value;

    public /* synthetic */ Property() {
    }

    public Property(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name:");
        sb.append(this.name);
        sb.append(", value:");
        sb.append(this.value);
        return sb.toString();
    }
}
