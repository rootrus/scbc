package com.thunderhead.android.infrastructure.features.interactions.allowedinteractions;

import p040o.FragmentBuilder_BindQuickPromptPayFragment;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface AllowedInteractionsApi {
    @GET("one/rt/js/interaction-map")
    @Headers({"Datamimetype: application/json"})
    Call<FragmentBuilder_BindQuickPromptPayFragment> retrieve(@Query("siteKey") String str, @Query("uri") String str2, @Query("pv") String str3, @Header("if-none-match") String str4);
}
