package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thunderhead.android.infrastructure.server.entitys.CapturePointData;

public class AddEditCapturePointResponse extends ServerResponse {
    private static final long serialVersionUID = -573384247131131800L;
    @SerializedName("data")
    @Expose
    private CapturePointData data;

    public CapturePointData getData() {
        return this.data;
    }

    public void setData(CapturePointData capturePointData) {
        this.data = capturePointData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("AddEditCapturePointResponse{");
        sb.append("data=");
        sb.append(this.data.toString());
        sb.append('}');
        return sb.toString();
    }
}
