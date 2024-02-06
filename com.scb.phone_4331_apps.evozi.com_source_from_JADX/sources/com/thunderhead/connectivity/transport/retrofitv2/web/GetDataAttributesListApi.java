package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.responses.DataAttributesListResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GetDataAttributesListApi {
    @GET("one/oauth2/services/api/workspaces/{workspace-id}/dataadapters/internal/CustomerMetaDataAdapter")
    @Headers({"X-Requested-With: XMLHttpRequest"})
    Call<DataAttributesListResponse> getList();
}
