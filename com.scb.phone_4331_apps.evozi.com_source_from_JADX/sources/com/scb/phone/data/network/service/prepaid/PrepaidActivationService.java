package com.scb.phone.data.network.service.prepaid;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ImmutableClassToInstanceMap;
import p040o.ImmutableCollection;
import p040o.getEndValue;
import p040o.getLinearKeyframeProgress;
import p040o.getOverallProgress;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface PrepaidActivationService {
    @POST("v1/prepaidcards/activation/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getLinearKeyframeProgress>> getPrepaidActivateOtpConfirm(@Body ImmutableClassToInstanceMap.Builder builder, @Header("otpTokenUUID") String str, @Header("otp") String str2);

    @POST("/v1/prepaidcards/activation/landing")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getEndValue>> getPrepaidActivationLanding(@Body ImmutableClassToInstanceMap immutableClassToInstanceMap);

    @POST("/v1/prepaidcards/activation/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getOverallProgress>> getPrepaidActivationVerification(@Body ImmutableCollection immutableCollection);
}
