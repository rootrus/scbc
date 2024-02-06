package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.AddEditCapturePointRequest;
import com.thunderhead.android.infrastructure.server.responses.AddEditCapturePointResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AddCapturePointApi {
    @POST("one/oauth2/services/api/workspaces/{workspace-id}/capturePoint/")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddEditCapturePointResponse> addCapturePoint(@Body AddEditCapturePointRequest addEditCapturePointRequest);
}
