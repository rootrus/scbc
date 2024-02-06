package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.LottieCompositionFactory;
import p040o.scheduleDrawable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EasycashMCMCService {
    @GET("/v1/lending/request-info/mcmc/collateraldetail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieCompositionFactory.C36109>> getCarCollateralDetail(@Query("productType") String str, @Query("tilesVersion") String str2);

    @POST("/v1/lending/request-info/mcmc/collateraldetail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<scheduleDrawable>> postCarCollateralDetail(@Body CustomConcurrentHashMap.NullEntry nullEntry);
}
