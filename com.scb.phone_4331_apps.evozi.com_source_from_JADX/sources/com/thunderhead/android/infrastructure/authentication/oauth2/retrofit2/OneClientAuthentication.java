package com.thunderhead.android.infrastructure.authentication.oauth2.retrofit2;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface OneClientAuthentication {
    @FormUrlEncoded
    @POST("one/oauth2token")
    Call<AuthenticationAccessToken> authenticate(@Header("Authorization") String str, @Field("grant_type") String str2);
}
