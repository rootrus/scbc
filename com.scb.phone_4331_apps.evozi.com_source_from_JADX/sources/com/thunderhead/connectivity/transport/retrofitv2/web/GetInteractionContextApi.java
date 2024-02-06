package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface GetInteractionContextApi {
    @GET("one/oauth2/services/api/workspaces/{workspace-id}/pageCfg")
    @Headers({"X-Requested-With: XMLHttpRequest"})
    Call<InteractionRegionResponse> getInteractionContext(@Query("url") String str);
}
