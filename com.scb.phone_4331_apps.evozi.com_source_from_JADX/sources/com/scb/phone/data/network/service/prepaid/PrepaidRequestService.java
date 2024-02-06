package com.scb.phone.data.network.service.prepaid;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ImmutableCollection;
import p040o.LottieInterpolatedFloatValue;
import p040o.LottieInterpolatedValue;
import p040o.interpolateValue;
import p040o.setInterval;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface PrepaidRequestService {
    @GET("/v1/prepaidcards/request/productcatalog")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setInterval>> getPrepaidProductCatalog();

    @POST("/v1/prepaidcards/request/landing")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieInterpolatedValue>> getPrepaidRequestLanding(@Body ImmutableCollection.ArrayImmutableCollection arrayImmutableCollection);

    @POST("v1/prepaidcards/request/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieInterpolatedFloatValue>> getPrepaidRequestOtpConfirm(@Body ImmutableCollection.SerializedForm serializedForm, @Header("otpTokenUUID") String str, @Header("otp") String str2);

    @POST("/v2/prepaidcards/request/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<interpolateValue>> getPrepaidRequestVerification(@Body ImmutableCollection.EmptyImmutableCollection emptyImmutableCollection);
}
