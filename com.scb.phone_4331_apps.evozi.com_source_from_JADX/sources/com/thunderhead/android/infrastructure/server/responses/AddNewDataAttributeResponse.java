package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;

public class AddNewDataAttributeResponse extends ServerResponse {
    private static final long serialVersionUID = -7231086287794548999L;
    @SerializedName("data")
    @Expose
    private AttributeData data;

    public AttributeData getData() {
        return this.data;
    }

    public void setData(AttributeData attributeData) {
        this.data = attributeData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" AddNewDataAttributeResponse{");
        sb.append("data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
