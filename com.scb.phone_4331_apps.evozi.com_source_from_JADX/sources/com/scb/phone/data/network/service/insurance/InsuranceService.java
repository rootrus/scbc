package com.scb.phone.data.network.service.insurance;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.getHighlightLength;
import p040o.getMiterLimit;
import p040o.getStartPoint;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface InsuranceService {
    @POST("v1/insurance/payment/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getHighlightLength>> confirmPayment(@Body CustomConcurrentHashMap.Values values);

    @POST("v1/insurance/payment/initiate")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getStartPoint>> initiatePayment(@Body CustomConcurrentHashMap.WeakEntry weakEntry);

    @GET("v1/insurance/portfolio/summary")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getMiterLimit>> portfolioSummary();
}
