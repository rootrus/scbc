package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.PerformanceTracker;
import p040o.getAnimatedValue;
import p040o.getAnimatedValueAbsolute;
import p040o.softKeys;
import p040o.weakKeys;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface OtpService {
    @POST("v1/ekyc/generateOTP")
    DebitCardResetOtpActivity<getAnimatedValueAbsolute> getEkycOtpCode(@Body softKeys softkeys);

    @POST("v1/loanorigination/ntb/generateOTP")
    DebitCardResetOtpActivity<SingleDataEntity<getAnimatedValue>> getLoanoriginationOtpCode(@Body weakKeys weakkeys);

    @POST("v1/profiles/generateOTP")
    DebitCardResetOtpActivity<getAnimatedValueAbsolute> getOtpCode(@Body softKeys softkeys);

    @POST("/v1/email/verify/requestOTP")
    DebitCardResetOtpActivity<SingleDataEntity<PerformanceTracker.FrameListener>> requestEmailOtp();
}
