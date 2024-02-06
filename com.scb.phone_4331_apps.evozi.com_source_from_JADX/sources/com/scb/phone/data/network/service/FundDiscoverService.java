package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.EnumHashBiMap;
import p040o.getCurves;
import p040o.getShapePath;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface FundDiscoverService {
    @GET("v1/mutualfunds/discovery/config")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getShapePath>> getDiscoverConfig();

    @POST("v1/mutualfunds/discovery/search")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurves>> searchFund(@Body EnumHashBiMap enumHashBiMap);
}
