package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;

public class AddEditTrackingPointResponse extends ServerResponse {
    @SerializedName("data")
    @Expose
    private TrackingPointData data;

    public TrackingPointData getData() {
        return this.data;
    }

    public void setData(TrackingPointData trackingPointData) {
        this.data = trackingPointData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("AddEditTrackingPointResponse{");
        sb.append("data=");
        sb.append(this.data.toString());
        sb.append('}');
        return sb.toString();
    }
}
