package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thunderhead.android.infrastructure.server.entitys.TouchpointData;

public class CreateTouchpointResponse extends ServerResponse {
    private static final long serialVersionUID = 5458441184832617278L;
    @SerializedName("data")
    @Expose
    private TouchpointData data;

    public TouchpointData getData() {
        return this.data;
    }

    public void setData(TouchpointData touchpointData) {
        this.data = touchpointData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" CreateTouchpointResponse{");
        sb.append("data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
