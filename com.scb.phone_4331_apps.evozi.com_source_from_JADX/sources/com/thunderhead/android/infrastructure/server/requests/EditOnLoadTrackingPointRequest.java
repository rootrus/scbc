package com.thunderhead.android.infrastructure.server.requests;

public class EditOnLoadTrackingPointRequest extends EditTrackingPointRequest {
    private static String ON_LOAD_TYPE = "ON_LOAD";

    public EditOnLoadTrackingPointRequest() {
        super(ON_LOAD_TYPE);
    }
}
