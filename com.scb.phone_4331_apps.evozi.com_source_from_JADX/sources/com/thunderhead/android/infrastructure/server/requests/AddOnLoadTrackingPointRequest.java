package com.thunderhead.android.infrastructure.server.requests;

public class AddOnLoadTrackingPointRequest extends AddTrackingPointRequest {
    private static String ON_LOAD_TYPE = "ON_LOAD";

    public AddOnLoadTrackingPointRequest() {
        super(ON_LOAD_TYPE, (String) null);
    }
}
