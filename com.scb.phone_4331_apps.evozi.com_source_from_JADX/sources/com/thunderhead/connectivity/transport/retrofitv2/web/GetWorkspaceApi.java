package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.WorkspaceResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface GetWorkspaceApi {
    @GET("one/oauth2/services/api/workspaces")
    @Headers({"X-Requested-With: XMLHttpRequest"})
    Call<WorkspaceResponse> getWorkspace(@Query("sk") String str);
}
