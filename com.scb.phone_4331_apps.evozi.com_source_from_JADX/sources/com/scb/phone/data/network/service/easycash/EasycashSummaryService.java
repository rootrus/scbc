package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.PerformanceTracker;
import p040o.removeFailureListener;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EasycashSummaryService {
    @GET("/v1/lending/apply/{productPath}/review")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<PerformanceTracker>> getSummary(@Path("productPath") String str, @Query("productType") String str2, @Query("tilesVersion") String str3);

    @POST("/v1/lending/apply/{productPath}/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<removeFailureListener>> postConfirmation(@Path("productPath") String str, @Body CustomConcurrentHashMap.EntryFactory.C32959 r2);
}
