package com.thunderhead.android.infrastructure.features.touchpoints.retrofit2;

import com.thunderhead.android.infrastructure.server.requests.CreateTouchpointRequest;
import com.thunderhead.android.infrastructure.server.responses.CreateTouchpointResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Retrofit2TouchpointsService {
    @POST("/one/oauth2/services/api/workspaces/{workspace-id}/touchpoints/")
    Call<CreateTouchpointResponse> create(@Body CreateTouchpointRequest createTouchpointRequest);
}
