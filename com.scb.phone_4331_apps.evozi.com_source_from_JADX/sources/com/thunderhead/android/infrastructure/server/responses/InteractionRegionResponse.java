package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thunderhead.android.infrastructure.server.entitys.InteractionData;

public class InteractionRegionResponse extends ServerResponse {
    private static final long serialVersionUID = 4880215619232550530L;
    @SerializedName("data")
    @Expose
    private InteractionData data;

    public InteractionData getData() {
        return this.data;
    }

    public void setData(InteractionData interactionData) {
        this.data = interactionData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" InteractionRegionResponse{");
        sb.append("data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }
}
