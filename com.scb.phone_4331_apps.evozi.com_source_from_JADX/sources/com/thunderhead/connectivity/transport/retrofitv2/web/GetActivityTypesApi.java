package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.ActivityTypesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GetActivityTypesApi {
    @GET("one/oauth2/services/api/workspaces/{workspace-id}/events")
    @Headers({"X-Requested-With: XMLHttpRequest"})
    Call<ActivityTypesResponse> getActivityTypes();
}
