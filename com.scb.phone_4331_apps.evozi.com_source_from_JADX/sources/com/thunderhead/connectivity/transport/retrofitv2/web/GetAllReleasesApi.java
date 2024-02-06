package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.GetAllReleasesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GetAllReleasesApi {
    @GET("one/oauth2/services/api/workspaces/{workspace-id}/release?include-launchpad=true")
    @Headers({"X-Requested-With: XMLHttpRequest"})
    Call<GetAllReleasesResponse> loadAllAvailableReleases();
}
