package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface InteractionApi {
    @POST("one/oauth1/rt/api/2.0/interaction")
    @Headers({"Datamimetype: application/json"})
    Call<BaseResponse> sendInteraction(@Query("sk") String str, @Query("tid") String str2, @Query("pv") String str3, @Body BaseRequest baseRequest);

    @PUT("one/oauth1/rt/api/2.0/interaction/offline")
    @Headers({"Datamimetype: application/json"})
    Call<BaseResponse> sendOfflineInteraction(@Query("sk") String str, @Query("tid") String str2, @Query("pv") String str3, @Body BaseRequest baseRequest);
}
