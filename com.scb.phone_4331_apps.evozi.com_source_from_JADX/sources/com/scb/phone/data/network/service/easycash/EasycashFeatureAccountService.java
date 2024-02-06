package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.ResponseBody;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.clearValue;
import p040o.removeAnimatorUpdateListener;
import p040o.setImagesAssetsFolder;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EasycashFeatureAccountService {
    @GET("/v2/lending/request-info/operative-account")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<removeAnimatorUpdateListener>> getFeatureOperativeAccount(@Query("productType") String str, @Query("productProgram") String str2, @Query("tilesVersion") String str3);

    @GET("/v1/lending/request-info/operative-account")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setImagesAssetsFolder>> getOperativeAccount(@Query("productType") String str, @Query("productProgram") String str2, @Query("tilesVersion") String str3);

    @POST("/v1/lending/request-info/operative-account")
    BScanCNotificationDeepLinkActivity<ResponseBody> postOperativeAccount(@Body clearValue clearvalue);
}
