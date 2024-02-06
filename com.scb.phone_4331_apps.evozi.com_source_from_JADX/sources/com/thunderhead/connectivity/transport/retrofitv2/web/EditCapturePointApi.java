package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.AddEditCapturePointRequest;
import com.thunderhead.android.infrastructure.server.responses.AddEditCapturePointResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EditCapturePointApi {
    @DELETE("one/oauth2/services/api/workspaces/{workspace-id}/capturePoint/{capturePointID}")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddEditCapturePointResponse> deleteCapturePoint(@Path("capturePointID") String str);

    @PUT("one/oauth2/services/api/workspaces/{workspace-id}/capturePoint/{capturePointID}")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddEditCapturePointResponse> updateCapturePoint(@Path("capturePointID") String str, @Body AddEditCapturePointRequest addEditCapturePointRequest);
}
