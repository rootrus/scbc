package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.AddTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.responses.AddEditTrackingPointResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AddTrackingPointApi {
    @POST("one/oauth2/services/api/workspaces/{workspace-id}/trackingpoint/")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddEditTrackingPointResponse> addOnLoadTrackingPoint(@Body AddTrackingPointRequest addTrackingPointRequest);
}
