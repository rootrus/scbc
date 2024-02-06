package com.thunderhead.connectivity.transport.retrofitv2.web;

import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface PropertiesApi {
    @PUT("one/oauth1/rt/api/2.0/interaction")
    @Headers({"Datamimetype: application/json"})
    Call<BaseResponse> sendProperties(@Query("sk") String str, @Query("pv") String str2, @Query("tid") String str3, @Body PropertiesRequest propertiesRequest);

    @PUT("one/oauth1/rt/api/2.0/interaction")
    @Headers({"Datamimetype: application/json"})
    Call<BaseResponse> sendProperties(@HeaderMap Map<String, Long> map, @Query("sk") String str, @Query("pv") String str2, @Query("tid") String str3, @Body PropertiesRequest propertiesRequest);
}
