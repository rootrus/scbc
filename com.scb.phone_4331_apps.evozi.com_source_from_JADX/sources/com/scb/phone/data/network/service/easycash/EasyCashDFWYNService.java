package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.notifyFailureListeners;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EasyCashDFWYNService {
    @GET("/v1/lending/product/referral/{productType}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<notifyFailureListeners>> getReferralProductDFWYN(@Path("productType") String str, @Query("tilesVersion") String str2);
}
