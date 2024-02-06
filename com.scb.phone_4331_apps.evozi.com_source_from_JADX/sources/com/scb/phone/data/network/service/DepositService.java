package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.Collections2;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieComposition;
import p040o.fromAssetFileName;
import p040o.fromRawFile;
import p040o.getFrameRate;
import p040o.getImages;
import p040o.getMaskAndMatteCount;
import p040o.incrementMatteOrMaskCount;
import p040o.poll;
import p040o.replace;
import p040o.setCurrentItemInternal;
import p040o.setHasDashPattern;
import p040o.valueIterator;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface DepositService {
    @HTTP(hasBody = true, method = "DELETE", path = "v1/deposits/transactions/annotations")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteAnnotation(@Body poll poll);

    @POST("v1/deposits/statement/request")
    DebitCardResetOtpActivity<setCurrentItemInternal> exportDepositStatement(@Body CustomConcurrentHashMap.AbstractSerializationProxy abstractSerializationProxy);

    @POST("v2/deposits/casa/details")
    DebitCardResetOtpActivity<getImages> getCasaDetails(@Body valueIterator valueiterator);

    @POST("v2/deposits/casa/transactions")
    DebitCardResetOtpActivity<SingleDataEntity<getFrameRate>> getCasaTxnList(@Body replace replace);

    @GET("v3/deposits/openaccounts/products/info")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getMaskAndMatteCount>> getDepositProductInfo(@Query("openFlag") String str, @Query("accountType") String str2, @Query("tilesVersion") String str3);

    @POST("v2/deposits/fixed/details")
    DebitCardResetOtpActivity<LottieComposition.C12361> getFixedDetailV2(@Body valueIterator valueiterator);

    @POST("v1/deposits/fixed/details")
    DebitCardResetOtpActivity<setHasDashPattern> getFixedDetails(@Body valueIterator valueiterator);

    @POST("v1/deposits/longterm/details")
    DebitCardResetOtpActivity<fromAssetFileName> getLongtermDetails(@Body valueIterator valueiterator);

    @POST("v1/deposits/statement/prerequest")
    DebitCardResetOtpActivity<SingleDataEntity<fromRawFile>> getStatementPreRequest(@Body valueIterator valueiterator);

    @POST("v2/deposits/summary")
    DebitCardResetOtpActivity<incrementMatteOrMaskCount> getSummary(@Body Collections2.FilteredCollection.C31802 r1);

    @POST("v1/deposits/transactions/annotations")
    DebitCardResetOtpActivity<setCurrentItemInternal> setAnnotation(@Body poll poll);

    @PUT("v1/deposits/transactions/annotations")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateAnnotation(@Body poll poll);
}
