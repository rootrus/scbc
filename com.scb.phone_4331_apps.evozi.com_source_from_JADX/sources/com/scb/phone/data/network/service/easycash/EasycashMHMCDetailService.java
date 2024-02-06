package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.ResponseBody;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieDrawable;
import p040o.getFileName;
import p040o.nextInChain;
import p040o.nextInTable;
import p040o.scheduleDrawable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EasycashMHMCDetailService {
    @GET("/v1/lending/request-info/mhmc/collateraldetail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getFileName>> getCollateralDetail(@Query("productType") String str, @Query("tilesVersion") String str2);

    @GET("/v1/lending/request-info/mhmc/detail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C36235>> getMHMCDetail(@Query("productType") String str, @Query("tilesVersion") String str2);

    @POST("/v1/lending/request-info/mhmc/detail")
    BScanCNotificationDeepLinkActivity<ResponseBody> postMHMCDetail(@Body CustomConcurrentHashMap.EntrySet entrySet);

    @POST("/v1/lending/request-info/mhmc/detail/calculation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C36213>> postMHMCDetailCalculation(@Body nextInTable nextintable);

    @POST("/v1/lending/request-info/mhmc/collateraldetail")
    DebitCardResetOtpActivity<SingleDataEntity<scheduleDrawable>> sendMortgageRequestInfo(@Body nextInChain nextinchain);
}
