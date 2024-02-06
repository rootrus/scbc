package com.thunderhead.android.infrastructure.server.entitys;

import android.text.TextUtils;
import java.util.Arrays;

public class AttributeData {
    public static final String BOOLEAN_TYPE = "BOOLEAN";
    public static final String CONTROL_GROUP = "inControlGroup";
    public static final String CUSTOMER_FIRST_INTERACTION = "creationDate";
    public static final String CUSTOMER_KEY = "customerKey";
    public static final String NUMERIC_TYPE = "NUMERIC";
    public static final String RECOGNIZED_CUSTOMER = "recognized";
    public static final String SYMBOLIC_TYPE = "SYMBOLIC";
    public String absoluteName;
    public String alias;
    public AttributeData[] attributes;
    public String dataType;
    public String defaultValue;
    public String description;
    public boolean dynamic;
    public boolean enabled;

    /* renamed from: id */
    public String f3107id;
    public String index;
    public String keyApiName;
    public String name;
    public String possibleValues;
    public String template;
    public String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public AttributeData[] getAttributes() {
        return this.attributes;
    }

    public String getName() {
        return this.name;
    }

    public String getDisplayName() {
        if (!TextUtils.isEmpty(this.alias)) {
            return this.alias;
        }
        return this.name;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isDynamic() {
        return this.dynamic;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getAbsoluteName() {
        return this.absoluteName;
    }

    public String getDataType() {
        String str = this.dataType;
        if (str == null || str.isEmpty()) {
            return this.type;
        }
        return this.dataType;
    }

    public String getPossibleValues() {
        return this.possibleValues;
    }

    public String getTemplate() {
        return this.template;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public String getIndex() {
        return this.index;
    }

    public String getId() {
        return this.f3107id;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setId(String str) {
        this.f3107id = str;
    }

    public String getKeyApiName() {
        return this.keyApiName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name:");
        sb.append(this.name);
        sb.append(", attributes:");
        sb.append(Arrays.toString(this.attributes));
        sb.append(", enabled:");
        sb.append(this.enabled);
        sb.append(", description:");
        sb.append(this.description);
        sb.append(", alias:");
        sb.append(this.alias);
        sb.append(", dynamic:");
        sb.append(this.dynamic);
        sb.append(", absoluteName:");
        sb.append(this.absoluteName);
        sb.append(", keyApiName:");
        sb.append(this.keyApiName);
        sb.append(", dataType:");
        sb.append(this.dataType);
        sb.append(", possibleValues:");
        sb.append(this.possibleValues);
        sb.append(", template:");
        sb.append(this.template);
        sb.append(", defaultValue:");
        sb.append(this.defaultValue);
        sb.append(", index:");
        sb.append(this.index);
        sb.append(", id:");
        sb.append(this.f3107id);
        sb.append(", keyApiName:");
        sb.append(this.keyApiName);
        return sb.toString();
    }
}
