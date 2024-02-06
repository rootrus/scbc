package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C5431transform;
import p040o.CustomConcurrentHashMap;
import p040o.fromAssetSync;
import p040o.fromJson;
import p040o.fromJsonReaderSync;
import p040o.fromJsonStringSync;
import p040o.fromRawRes;
import p040o.newStrongInterner;
import p040o.readEntries;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface DirectDebitService {
    @POST("/v1/directdebit/registration/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fromJsonReaderSync>> confirmRegistrationDirectDebit(@Body readEntries readentries, @Header("tokenUUID") String str, @Header("otp") String str2);

    @POST("/v1/directdebit/billers/info")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fromAssetSync>> getBillerInfo(@Body C5431transform transform);

    @GET("/v1/directdebit/billers/info/recommend")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fromJson>> getRecommendedBiller();

    @POST("/v1/directdebit/bill/scan")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fromRawRes>> getScanBillerInfo(@Body newStrongInterner newstronginterner);

    @POST("/v1/directdebit/registration/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fromJsonStringSync>> verifyRegistration(@Body CustomConcurrentHashMap.EntryFactory.C328811 r1);
}
