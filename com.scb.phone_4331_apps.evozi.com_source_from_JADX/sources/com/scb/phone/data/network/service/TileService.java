package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ComparisonChain;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingConcurrentMap;
import p040o.KeyframeParser;
import p040o.MaskParser;
import p040o.isAnchorPointIdentity;
import p040o.jsonObjectToPoint;
import p040o.jsonToColor;
import p040o.setCurrentItemInternal;
import p040o.standardContainsAll;
import p040o.standardRemoveAll;
import p040o.standardRetainAll;
import p040o.standardToArray;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface TileService {
    @POST("v1/profiles/tiles/static/findByTileId")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<jsonObjectToPoint>> findByTileId(@Body standardToArray standardtoarray);

    @POST("v1/profiles/tiles/all")
    DebitCardResetOtpActivity<SingleDataEntity<KeyframeParser>> getAllTilesList(@Body standardRetainAll standardretainall);

    @POST("v3/profiles/tiles/all")
    DebitCardResetOtpActivity<SingleDataEntity<KeyframeParser>> getAllTilesV3(@Body standardContainsAll standardcontainsall);

    @POST("v1/profiles/tiles/bankingservices")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<isAnchorPointIdentity>> getBankingServiceTiles(@Body ComparisonChain.InactiveComparisonChain inactiveComparisonChain);

    @GET("v1/profiles/tiles/banner")
    DebitCardResetOtpActivity<SingleDataEntity<KeyframeParser>> getBannerTilesList(@Header("tilesVersion") String str);

    @POST("v1/profiles/tiles/dynamic")
    DebitCardResetOtpActivity<SingleDataEntity<KeyframeParser>> getDynamicTilesList(@Body standardRetainAll standardretainall);

    @POST("/v1/profiles/tiles/predictive")
    DebitCardResetOtpActivity<SingleDataEntity<KeyframeParser>> getPredictiveTilesList(@Body standardRetainAll standardretainall);

    @POST("v7/profiles/tiles/static")
    DebitCardResetOtpActivity<SingleDataEntity<KeyframeParser>> getStaticTileList(@Body standardRetainAll standardretainall);

    @POST("v9/profiles/tiles/static")
    DebitCardResetOtpActivity<SingleDataEntity<jsonToColor>> getStaticTilesV9(@Body standardRetainAll standardretainall);

    @POST("v1/profiles/tiles/static/unselected")
    DebitCardResetOtpActivity<SingleDataEntity<MaskParser>> getUnselectedTiles(@Body ForwardingConcurrentMap forwardingConcurrentMap);

    @PUT("v1/profiles/tiles/static")
    DebitCardResetOtpActivity<setCurrentItemInternal> rearrangeStaticTiles(@Body standardRemoveAll standardremoveall);

    @DELETE("v1/profiles/tiles/reset")
    DebitCardResetOtpActivity<setCurrentItemInternal> reset();
}
