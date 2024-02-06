package com.scb.phone.data.network.service.privacymanagement;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.SimpleLottieValueCallback;
import p040o.TSnackbar$SnackbarLayout;
import p040o.reverseIndex;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface PrivacyManagementService {
    @GET("v1/privacy/consent/content")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<SimpleLottieValueCallback>> getConsentContent(@Query("tilesVersion") String str, @Query("consentType") String str2);

    @GET("v1/privacy/types")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<TSnackbar$SnackbarLayout>> getPrivacyList(@Query("tilesVersion") String str);

    @PUT("v1/privacy/consent")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> updateConsent(@Body reverseIndex reverseindex);
}
