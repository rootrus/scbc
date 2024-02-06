package com.scb.phone.data.network.service;

import com.google.gson.JsonObject;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.RequestBody;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ShapeStroke;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PartnerDiscoverWebViewService {
    @POST("v1/mutualfunds/fundfactsheet")
    BScanCNotificationDeepLinkActivity<JsonObject> getFundData(@Body RequestBody requestBody);

    @POST("/v1/mutualfunds/fundfactsheet/historicaldata")
    BScanCNotificationDeepLinkActivity<JsonObject> getHistoricalData(@Body RequestBody requestBody);

    @POST("v1/mutualfunds/investnow")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<ShapeStroke.LineCapType>> getInvestFund(@Body RequestBody requestBody);
}
