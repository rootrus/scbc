package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.setCurrentItemInternal;
import p040o.standardEquals;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface PartnerService {
    @POST("v1/login/partner")
    DebitCardResetOtpActivity<Response<setCurrentItemInternal>> login(@Body standardEquals standardequals);

    @POST("v2/login/partner/refresh")
    DebitCardResetOtpActivity<Response<setCurrentItemInternal>> loginFingerprint(@Header("Api-Refresh") String str, @Body standardEquals standardequals);
}
