package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.WorkspaceResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface GetInteractionRegionDetailsAPI {
    @GET("one/oauth2/services/api/workspaces")
    @Headers({"Datamimetype: application/json", "X-Requested-With: XMLHttpRequest", "Accept-Language: en-us"})
    Call<WorkspaceResponse> getInteractionRegionDetailsAPI(@Query("sk") String str);
}
