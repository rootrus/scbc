package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.ResponseBody;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieAnimationView;
import p040o.newValueReference;
import p040o.processPendingNotifications;
import p040o.putIfAbsent;
import p040o.reclaimKey;
import p040o.setCurrentItemInternal;
import p040o.setProgress;
import p040o.setRenderMode;
import p040o.setRepeatCount;
import p040o.setScale;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface DebitCardService {
    @POST("/v1/debitcards/activation/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<setScale>> activateDebitCard(@Header("otp") String str, @Header("otpTokenUUID") String str2, @Body putIfAbsent putifabsent);

    @POST("/v1/debitcards/request/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<setProgress>> confirmDebitCard(@Header("otp") String str, @Header("otpTokenUUID") String str2, @Body newValueReference newvaluereference);

    @Streaming
    @GET
    DebitCardResetOtpActivity<Response<ResponseBody>> downloadPDF(@Url String str);

    @POST("/v1/debitcards/activation/landing")
    DebitCardResetOtpActivity<SingleDataEntity<setRepeatCount>> getDebitCardActivationLandingData(@Body CustomConcurrentHashMap.C32852 r1);

    @POST("/v1/debitcards/request/landing")
    DebitCardResetOtpActivity<SingleDataEntity<LottieAnimationView.C12312>> getDebitCardLandingData(@Body CustomConcurrentHashMap.C32852 r1);

    @POST("/v1/debitcards/resetpin")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> getDebitResetOtpConfirm(@Body CustomConcurrentHashMap.C32841 r1, @Header("otpTokenUUID") String str, @Header("otp") String str2);

    @GET("/v1/debitcards/request/productcatalog")
    DebitCardResetOtpActivity<LottieAnimationView.C12301> getProductCatalog();

    @POST("/v1/debitcards/request/verification")
    DebitCardResetOtpActivity<SingleDataEntity<LottieAnimationView.C12344>> verifyDebitCard(@Body reclaimKey reclaimkey);

    @POST("/v1/debitcards/activation/verification")
    DebitCardResetOtpActivity<SingleDataEntity<setRenderMode>> verifyDebitCardActivation(@Body processPendingNotifications processpendingnotifications);
}
