package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.LottieAnimationView;
import p040o.createFromParcel;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface GoogleSigninService {
    @POST("/oauth2/v4/token")
    DebitCardResetOtpActivity<createFromParcel> postGoogleSignin(@Body LottieAnimationView.C12323 r1);
}
