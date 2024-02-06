package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ContentModelParser;
import p040o.DebitCardResetOtpActivity;
import p040o.getTextInternal;
import p040o.invalidateText;
import p040o.offer;
import p040o.preWriteCleanup;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface NTBTileService {
    @POST("/v1/customer/ntb/tiles/all")
    DebitCardResetOtpActivity<SingleDataEntity<ContentModelParser>> getAllDemoTiles(@Body offer offer);

    @POST("/v1/customer/ntb/tiles/bankingservices")
    DebitCardResetOtpActivity<SingleDataEntity<ContentModelParser>> getBankingServiceTiles(@Body offer offer);

    @GET("/v1/profiles/tiles/banner")
    DebitCardResetOtpActivity<SingleDataEntity<ContentModelParser>> getBannerTiles(@Header("tilesVersion") String str);

    @POST("/v1/customer/ntb/tiles/dynamic")
    DebitCardResetOtpActivity<SingleDataEntity<ContentModelParser>> getDynamicTiles(@Body offer offer);

    @POST("/v1/cta/deposits/openaccount/etbopenaccount")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getTextInternal>> getETBCheckActiveCASA(@Body preWriteCleanup prewritecleanup);

    @POST("/v1/customer/ntb/tiles/predictive")
    DebitCardResetOtpActivity<SingleDataEntity<ContentModelParser>> getPredictiveTiles(@Body offer offer);

    @POST("v1/deposits/openaccount/etbnoactivecasa/statictile")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<invalidateText>> getStaticTileList(@Body preWriteCleanup prewritecleanup);

    @POST("/v1/customer/ntb/tiles/static")
    DebitCardResetOtpActivity<SingleDataEntity<ContentModelParser>> getStaticTiles(@Body offer offer);
}
