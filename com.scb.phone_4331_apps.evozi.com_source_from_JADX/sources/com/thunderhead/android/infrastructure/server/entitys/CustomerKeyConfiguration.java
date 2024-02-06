package com.thunderhead.android.infrastructure.server.entitys;

public class CustomerKeyConfiguration {
    public String name;
    public String type;

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerKeyConfiguration{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.type);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
