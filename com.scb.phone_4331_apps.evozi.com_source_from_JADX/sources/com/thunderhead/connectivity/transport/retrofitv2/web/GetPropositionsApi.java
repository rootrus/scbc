package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.PropositionResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GetPropositionsApi {
    @GET("one/oauth2/services/api/workspaces/{workspace-id}/propositions/roots")
    @Headers({"X-Requested-With: XMLHttpRequest"})
    Call<PropositionResponse> getProposition();
}
