package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.LottieDrawable;
import p040o.advance;
import p040o.advanceTo;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface EasycashMCMCDetailService {
    @GET("/v1/lending/request-info/mcmc/detail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C36268>> loanInfoDetail(@Query("productType") String str, @Query("tilesVersion") String str2);

    @POST("/v1/lending/request-info/mcmc/detail/calculation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.C36257>> postCalculation(@Body advance advance);

    @POST("/v1/lending/request-info/mcmc/detail")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postLoanDetail(@Body advanceTo advanceto);
}
