package com.scb.phone.data.network.service.prepaid;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ImmutableEnumSet;
import p040o.ImmutableList;
import p040o.LottieInterpolatedIntegerValue;
import p040o.LottieInterpolatedPointValue;
import p040o.LottieRelativeFloatValueCallback;
import p040o.ScaleXY;
import p040o.checkElementNotNull;
import p040o.construct;
import p040o.getValueInternal;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PrepaidTravelService {
    @PUT("/v1/prepaidcards/blockstatus")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> getPrepaidTravelBlockStatus(@Body ImmutableEnumSet immutableEnumSet);

    @POST("/v1/prepaidcards/travelcards/conversionconfirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getValueInternal>> getPrepaidTravelConversionConfirm(@Body checkElementNotNull checkelementnotnull);

    @POST("/v1/prepaidcards/travelcards/conversionlanding")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieInterpolatedPointValue>> getPrepaidTravelConversionLanding(@Body construct construct);

    @POST("/v1/prepaidcards/travelcards/conversionverification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieInterpolatedIntegerValue>> getPrepaidTravelConversionVerification(@Body ImmutableList immutableList);

    @POST("/v1/prepaidcards/travelcards/displayRate")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieRelativeFloatValueCallback>> getTravelWalletDisplayRate(@Body ImmutableEnumSet.EnumSerializedForm enumSerializedForm);

    @POST("/v1/prepaidcards/travelcards/walletsummary")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<ScaleXY>> getTravelWalletSummary(@Body ImmutableList.Builder builder);
}
