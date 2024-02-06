package com.scb.phone.data.network.service.registration;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableSet;
import p040o.ImmutableSetMultimap;
import p040o.PieChart;
import p040o.onMarkerDragStart;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RegistrationService {
    @GET("v2/customer/countries")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<PieChart>> getCountryList();

    @POST("v2/registration/referral")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> postReferralCode(@Body ImmutableSetMultimap immutableSetMultimap);

    @POST("isprint/soap/dpParams")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> postRegistrationLandingConf(@Body ImmutableSet.Builder builder);

    @POST("v1/registration/verifypin")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> verifyPin(@Body onMarkerDragStart onmarkerdragstart);
}
