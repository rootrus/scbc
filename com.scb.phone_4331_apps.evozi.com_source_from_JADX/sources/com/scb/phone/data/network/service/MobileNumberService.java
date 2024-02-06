package com.scb.phone.data.network.service;

import p040o.C6808xbcae765b;
import p040o.DebitCardResetOtpActivity;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface MobileNumberService {
    @GET("msisdn")
    @Headers({"Cache-Control: max-age=0, no-cache"})
    DebitCardResetOtpActivity<C6808xbcae765b> getPhoneNumberFromServer(@Query("date") Long l);
}
