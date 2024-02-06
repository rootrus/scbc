package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.asFunction;
import p040o.intern;
import p040o.newBuilder;
import p040o.newWeakInterner;
import p040o.pathSegments;
import p040o.queryParameterValue;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CardlessATMService {
    @PUT("v2/cardlessatm/termcondversion")
    DebitCardResetOtpActivity<setCurrentItemInternal> acceptCardlessTnc();

    @POST("v1/cardlessatm/cancel")
    DebitCardResetOtpActivity<setCurrentItemInternal> getCancelWithdraw(@Body asFunction asfunction);

    @GET("v1/cardlessatm/info")
    DebitCardResetOtpActivity<SingleDataEntity<newBuilder>> getCardlessInfo();

    @POST("v2/cardlessatm/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<pathSegments>> getConfirmation(@Body newWeakInterner newweakinterner);

    @POST("v3/cardlessatm/verification")
    DebitCardResetOtpActivity<SingleDataEntity<queryParameterValue>> getVerification(@Body intern intern);
}
