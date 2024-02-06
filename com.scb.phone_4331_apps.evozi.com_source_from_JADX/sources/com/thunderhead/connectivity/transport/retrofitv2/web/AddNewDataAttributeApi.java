package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.AddNewDataAttributeRequest;
import com.thunderhead.android.infrastructure.server.responses.AddNewDataAttributeResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AddNewDataAttributeApi {
    @POST("one/oauth2/services/api/workspaces/{workspace-id}/dataadapters/attributes/{customerMetaData-id}/rootnode/")
    @Headers({"Accept-Language: en-us", "X-Requested-With: XMLHttpRequest"})
    Call<AddNewDataAttributeResponse> addNewDataAttribute(@Body AddNewDataAttributeRequest addNewDataAttributeRequest, @Path("customerMetaData-id") String str);
}
