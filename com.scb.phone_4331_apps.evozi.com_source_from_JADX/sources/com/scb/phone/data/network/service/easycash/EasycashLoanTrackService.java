package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.LottieDrawable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EasycashLoanTrackService {
    @GET("/v1/lending/inquiry/loan-info")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieDrawable.LazyCompositionTask>> inquiryLoanInfo(@Query("tilesVersion") String str);
}
