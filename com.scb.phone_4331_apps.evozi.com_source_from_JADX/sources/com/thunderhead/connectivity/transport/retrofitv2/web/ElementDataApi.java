package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.ElementDataRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ElementDataApi {
    @PUT("one/oauth1/rt/api/2.0/interaction")
    @Headers({"Datamimetype: application/json"})
    Call<BaseResponse> sendElementData(@Query("sk") String str, @Query("tid") String str2, @Query("pv") String str3, @Body ElementDataRequest elementDataRequest);
}
