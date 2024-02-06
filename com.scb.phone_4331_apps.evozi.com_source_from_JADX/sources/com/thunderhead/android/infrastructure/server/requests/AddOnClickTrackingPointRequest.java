package com.thunderhead.android.infrastructure.server.requests;

import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;

public class AddOnClickTrackingPointRequest extends AddTrackingPointRequest {
    public AddOnClickTrackingPointRequest(String str) {
        super(TrackingPointData.ON_CLICK_TYPE, str);
    }
}
