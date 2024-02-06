package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.LottieDrawable;
import p040o.getNextExpirable;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EasycashCommercialInfoService {
    @GET("/v1/lending/request-info/commercial/detail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C361915>> getCommercialDetail(@Query("productType") String str, @Query("tilesVersion") String str2);

    @POST("/v1/lending/request-info/commercial/detail")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postCommercialDetail(@Body getNextExpirable getnextexpirable);

    @POST("/v1/lending/request-info/commercial/detail/calculation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C36202>> postDetailCalculation(@Body CustomConcurrentHashMap.EntryFactory.C328710 r1);
}
