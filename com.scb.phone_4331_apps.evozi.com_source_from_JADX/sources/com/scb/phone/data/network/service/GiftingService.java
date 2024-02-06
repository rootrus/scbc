package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.DrawingContent;
import p040o.FillContent;
import p040o.GradientStrokeContent;
import p040o.GreedyContent;
import p040o.absorbContent;
import p040o.addPaths;
import p040o.getLinearGradient;
import p040o.getRadialGradient;
import p040o.setCurrentItemInternal;
import p040o.tryExpireEntries;
import p040o.unsetEntry;
import p040o.unsetLiveEntry;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface GiftingService {
    @POST("v1/giftings/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<FillContent>> confirmGift(@Body unsetEntry unsetentry);

    @POST("v1/giftings/present/confirm")
    DebitCardResetOtpActivity<SingleDataEntity<FillContent>> confirmGiftPresent(@Body unsetEntry unsetentry);

    @GET("v1/giftings/gifts")
    DebitCardResetOtpActivity<SingleDataEntity<getRadialGradient>> getGifts();

    @GET("v1/giftings/transactions/received")
    DebitCardResetOtpActivity<SingleDataEntity<GradientStrokeContent>> getReceivedGifting(@Query("lastTransactionId") String str);

    @GET("v1/giftings/transactions/sent")
    DebitCardResetOtpActivity<SingleDataEntity<absorbContent>> getSentGifting(@Query("lastTransactionId") String str);

    @GET("v1/config")
    DebitCardResetOtpActivity<SingleDataEntity<addPaths>> getSharingMomentConfig();

    @PUT("v1/giftings/transactions/open")
    DebitCardResetOtpActivity<setCurrentItemInternal> putOpenGift(@Body CustomConcurrentHashMap.Segment.C32981 r1);

    @POST("v1/giftings/present/review")
    DebitCardResetOtpActivity<SingleDataEntity<GreedyContent>> reviewPresent(@Body CustomConcurrentHashMap.Segment.EvictionQueue evictionQueue);

    @POST("v1/giftings/recipient/validation")
    DebitCardResetOtpActivity<SingleDataEntity<getLinearGradient>> validatePresent(@Body unsetLiveEntry unsetliveentry);

    @POST("v1/giftings/verification")
    DebitCardResetOtpActivity<SingleDataEntity<DrawingContent>> verifyMoneyGift(@Body tryExpireEntries tryexpireentries);
}
