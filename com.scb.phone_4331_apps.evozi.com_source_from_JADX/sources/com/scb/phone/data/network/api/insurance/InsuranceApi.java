package com.scb.phone.data.network.api.insurance;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.insurance.InsuranceService;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.getHighlightLength;
import p040o.getMiterLimit;
import p040o.getStartPoint;
import p040o.onGetStartedClick;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public final class InsuranceApi implements InsuranceService {
    private final InsuranceService MediaBrowserCompat$CustomActionResultReceiver;

    @POST("v1/insurance/payment/confirmation")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<getHighlightLength>> confirmPayment(@Body CustomConcurrentHashMap.Values values) {
        onGetStartedClick.write((Object) values, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.confirmPayment(values);
    }

    @POST("v1/insurance/payment/initiate")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<getStartPoint>> initiatePayment(@Body CustomConcurrentHashMap.WeakEntry weakEntry) {
        onGetStartedClick.write((Object) weakEntry, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.initiatePayment(weakEntry);
    }

    @GET("v1/insurance/portfolio/summary")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<getMiterLimit>> portfolioSummary() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.portfolioSummary();
    }

    @HmlPinActivity
    public InsuranceApi(InsuranceService insuranceService) {
        onGetStartedClick.write((Object) insuranceService, "service");
        this.MediaBrowserCompat$CustomActionResultReceiver = insuranceService;
    }
}
