package com.scb.phone.data.network.service.juristic;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.AnimatablePathValueParser;
import p040o.AnimatableTextPropertiesParser;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ExplicitOrdering;
import p040o.ForwardingCollection;
import p040o.buildRankMap;
import p040o.createAsList;
import p040o.fetchFromCache;
import p040o.fetchFromNetwork;
import p040o.fetchFromNetworkInternal;
import p040o.getErrorFromConnection;
import p040o.parseAnimatableTextProperties;
import p040o.setCurrentItemInternal;
import p040o.standardAddAll;
import p040o.standardClear;
import p040o.zzlx;
import p040o.zzly;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JuristicService {
    @POST("v1/juristic/profiles/resetpin/setpin")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> confirmResetPin(@Body ForwardingCollection forwardingCollection);

    @GET("/v1/juristic/devices/state/{deviceId}")
    DebitCardResetOtpActivity<SingleDataEntity<fetchFromCache>> deviceState(@Path("deviceId") String str);

    @POST("v1/juristic/smeservices/requestform")
    DebitCardResetOtpActivity<SingleDataEntity<fetchFromNetwork>> requestForm(@Body zzly zzly);

    @POST("/v1/juristic/profiles/resetpin/verifyuser")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchFromNetworkInternal>> resetPin(@Body zzlx.zza zza);

    @POST("/v1/juristic/preregistration/sendota")
    DebitCardResetOtpActivity<SingleDataEntity<getErrorFromConnection>> sendOta();

    @POST("v1/juristic/preregistration/setpin")
    DebitCardResetOtpActivity<setCurrentItemInternal> setupJuristicPin(@Body createAsList createaslist);

    @POST("/v1/juristic/preregistration/verifybypin")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<parseAnimatableTextProperties>> verifyBusinessPin(@Body buildRankMap buildrankmap);

    @POST("v1/juristic/preregistration/verifyotp")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<AnimatableTextPropertiesParser>> verifyOtp(@Header("otp") String str, @Header("tokenUUID") String str2, @Body standardClear standardclear);

    @POST("v1/juristic/profiles/resetpin/verifybypin")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchFromNetworkInternal>> verifyResetPin(@Body ForwardingCollection forwardingCollection);

    @POST("v1/juristic/profiles/resetpin/verifyotp")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchFromNetworkInternal>> verifyResetPinOtp(@Header("otp") String str, @Header("tokenUUID") String str2, @Body ExplicitOrdering explicitOrdering);

    @POST("/v1/juristic/preregistration/verifyuser")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<AnimatablePathValueParser>> verifyUser(@Body standardAddAll standardaddall);
}
