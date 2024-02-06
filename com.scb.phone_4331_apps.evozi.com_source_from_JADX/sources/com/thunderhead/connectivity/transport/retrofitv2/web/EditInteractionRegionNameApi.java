package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EditInteractionRegionNameApi {
    @PUT("one/oauth2/services/api/workspaces/{workspace-id}/pageCfg/{interactionId}")
    @Headers({"Content-Type: application/x-www-form-urlencoded", "Accept-Language: en-us"})
    Call<InteractionRegionResponse> editInteractionName(@Path("interactionId") String str, @Query("pagename") String str2, @Query("pagepath") String str3);
}
