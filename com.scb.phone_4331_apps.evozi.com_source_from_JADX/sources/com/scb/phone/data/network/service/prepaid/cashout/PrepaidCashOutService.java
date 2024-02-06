package com.scb.phone.data.network.service.prepaid.cashout;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ImmutableClassToInstanceMap;
import p040o.ImmutableCollection;
import p040o.getInterpolatedKeyframeProgress;
import p040o.getStartValue;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PrepaidCashOutService {
    @POST("/v1/prepaidcards/cashout/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getInterpolatedKeyframeProgress>> getPrepaidCashOutConfirmation(@Body ImmutableClassToInstanceMap.C34971 r1);

    @POST("/v1/prepaidcards/cashout/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getStartValue>> getPrepaidCashOutVerification(@Body ImmutableCollection.Builder builder);
}
