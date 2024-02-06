package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.EditTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.responses.AddEditTrackingPointResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EditTrackingPointApi {
    @DELETE("one/oauth2/services/api/workspaces/{workspace-id}/trackingpoint/{trackingPointID}")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddEditTrackingPointResponse> deleteTrackingPoint(@Path("trackingPointID") String str);

    @PUT("one/oauth2/services/api/workspaces/{workspace-id}/trackingpoint/{trackingPointID}")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddEditTrackingPointResponse> updateTrackingPoint(@Path("trackingPointID") String str, @Body EditTrackingPointRequest editTrackingPointRequest);
}
