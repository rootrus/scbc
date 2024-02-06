package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.LottieDrawable;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EasycashBusinessAndMaritalInfoService {
    @GET("/v1/lending/request-info/commercial/businessAndMarital")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C361612>> getBusinessAndMaritalInfo(@Query("tilesVersion") String str);

    @POST("/v1/lending/request-info/commercial/businessAndMarital")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> postBusinessAndMaritalInfo(@Body CustomConcurrentHashMap.QueueHolder queueHolder);
}
