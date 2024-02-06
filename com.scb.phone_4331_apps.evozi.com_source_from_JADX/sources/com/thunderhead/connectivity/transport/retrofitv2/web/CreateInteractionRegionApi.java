package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface CreateInteractionRegionApi {
    @POST("one/oauth2/services/api/workspaces/{workspace-id}/pageCfg")
    @Headers({"Content-Type: application/x-www-form-urlencoded", "X-Requested-With: XMLHttpRequest"})
    Call<InteractionRegionResponse> createInteractionRegion(@QueryMap Map<String, String> map);
}
