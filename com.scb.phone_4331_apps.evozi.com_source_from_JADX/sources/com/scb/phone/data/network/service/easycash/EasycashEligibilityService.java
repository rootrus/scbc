package com.scb.phone.data.network.service.easycash;

import p040o.BScanCNotificationDeepLinkActivity;
import p040o.setCurrentItemInternal;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EasycashEligibilityService {
    @GET("/v1/lending/service/validate/card/eligibility")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateCardEligibility(@Query("productType") String str, @Query("tilesVersion") String str2, @Query("flowType") String str3);

    @GET("/v1/lending/service/validate/mcmc/eligibility")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateMCMCEligibility(@Query("productType") String str, @Query("tilesVersion") String str2, @Query("flowType") String str3);

    @GET("/v1/lending/service/validate/speedyloan/eligibility")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateSpeedyLoanEligibility(@Query("productType") String str, @Query("tilesVersion") String str2, @Query("flowType") String str3);
}
