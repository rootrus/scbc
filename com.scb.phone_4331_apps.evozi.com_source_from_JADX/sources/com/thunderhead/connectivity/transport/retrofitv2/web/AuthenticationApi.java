package com.thunderhead.connectivity.transport.retrofitv2.web;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AuthenticationApi {
    @POST("one/idm_login")
    @Headers({"Content-Type: application/x-www-form-urlencoded", "X-Requested-With: XMLHttpRequest"})
    Call<ResponseBody> authentication(@Query("username") String str, @Query("password") String str2);
}
