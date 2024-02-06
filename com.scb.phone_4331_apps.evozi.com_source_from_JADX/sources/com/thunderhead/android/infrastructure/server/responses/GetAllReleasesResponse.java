package com.thunderhead.android.infrastructure.server.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thunderhead.android.infrastructure.server.entitys.ReleaseData;
import java.util.Arrays;

public class GetAllReleasesResponse extends ServerResponse {
    private static final long serialVersionUID = 7815557641634437225L;
    @SerializedName("data")
    @Expose
    private ReleaseData[] data;

    public ReleaseData[] getData() {
        return this.data;
    }

    public void setData(ReleaseData[] releaseDataArr) {
        this.data = releaseDataArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" GetAllReleasesResponse{");
        sb.append("data=");
        sb.append(Arrays.toString(this.data));
        sb.append('}');
        return sb.toString();
    }
}
