package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.Content;
import p040o.DebitCardResetOtpActivity;
import p040o.GoogleMap;
import p040o.runUnlockedCleanup;
import p040o.setCenterText;
import p040o.setCenterTextOffset;
import p040o.setCurrentItemInternal;
import p040o.standardEquals;
import p040o.unsetKey;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ForgotPinService {
    @GET("v1/login/resetpin/facestatus")
    DebitCardResetOtpActivity<setCurrentItemInternal> faceStatus(@Query("tilesVersion") String str);

    @POST("v2/login/resetpin")
    DebitCardResetOtpActivity<SingleDataEntity<setCenterText>> setupNewPin(@Body standardEquals standardequals);

    @GET("v1/login/resetpin/verifymethod")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextOffset>> verifyMethod();

    @GET("/v1/login/allowresetpin")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyOtpResetPin(@Header("tokenUUID") String str, @Header("otp") String str2);

    @POST("/v1/profiles/resetpin/verifyprofilesbyatm")
    DebitCardResetOtpActivity<SingleDataEntity<Content>> verifyProfileForgotPinByAtm(@Body unsetKey unsetkey);

    @POST("/v1/profiles/resetpin/verifyprofilesbycc")
    DebitCardResetOtpActivity<SingleDataEntity<Content>> verifyProfileForgotPinByCreditCard(@Body runUnlockedCleanup rununlockedcleanup);

    @POST("v1/login/resetpin/verifyuser")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> verifyUser(@Body GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener);
}
