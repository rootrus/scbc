package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BuildConfig;
import p040o.Constraints;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLinkUri;
import p040o.ImageAssetDelegate;
import p040o.LottieAnimationView;
import p040o.addLottieOnCompositionLoadedListener;
import p040o.beginSection;
import p040o.buildDrawingCache;
import p040o.enableOrDisableHardwareLayer;
import p040o.endSection;
import p040o.fetchBitmap;
import p040o.getFontPath;
import p040o.nullEntry;
import p040o.readStringList;
import p040o.setTraceEnabled;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RewardRedemptionService {
    @POST("v1/ccrewardredemption/redemptions")
    DebitCardResetOtpActivity<endSection> confirmRedemption(@Body Constraints.NotNullConstraint notNullConstraint);

    @POST("/v1/ccrewardredemption/{cardRef}/ecoupon/deactivate")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchBitmap>> deactivateECoupon(@Path("cardRef") String str, @Body Constraints.ConstrainedRandomAccessList constrainedRandomAccessList);

    @GET("/v1/ccrewardredemption/ecoupon/transactions/id/{deeplinkId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<BuildConfig>> getCardRefFromDeepLinkId(@Path("deeplinkId") String str);

    @POST("/v1/ccrewardredemption/{cardRef}/ecoupon/detail")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<beginSection>> getECouponDetail(@Path("cardRef") String str, @Body Constraints.ConstrainedRandomAccessList constrainedRandomAccessList);

    @POST("/v1/ccrewardredemption/{cardRef}/ecoupon/transactions")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setTraceEnabled>> getECouponTransaction(@Path("cardRef") String str, @Body nullEntry nullentry);

    @GET("/v1/ccrewardredemption/{cardRef}/rewards")
    DebitCardResetOtpActivity<buildDrawingCache> getOPRRewards(@Path("cardRef") String str, @Query("categoryId") int i);

    @GET("/v1/ccrewardredemption/{cardRef}/opr")
    DebitCardResetOtpActivity<LottieAnimationView> getOprDetails(@Path("cardRef") String str, @Query("categoryId") int i, @Query("type") readStringList readstringlist);

    @GET("v2/ccrewardredemption/products")
    DebitCardResetOtpActivity<getFontPath> getProducts(@Query("relationId") Integer num, @Query("page") int i, @Query("sortOption") String str, @Query("pointsHigh") Integer num2, @Query("cardCode") String str2, @Query("searchName") String str3, @Query("relationType") String str4);

    @GET("/v1/ccrewardredemption/{cardRef}/quotalimit")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<enableOrDisableHardwareLayer>> getQuotaLimit(@Path("cardRef") String str, @Query("relationId") Integer num, @Query("itemCode") String str2);

    @GET("v4/ccrewardredemption/categories")
    DebitCardResetOtpActivity<DeepLinkUri.Builder.ParseResult> getRewardCategories(@Query("cardCode") String str);

    @GET("v2/ccrewardredemption/products/list")
    DebitCardResetOtpActivity<SingleDataEntity<ImageAssetDelegate>> getSearchSuggestionList(@Query("cardCode") String str, @Query("relationType") String str2);

    @GET("v1/ccrewardredemption/tiers")
    DebitCardResetOtpActivity<addLottieOnCompositionLoadedListener> getTiers(@Query("categoryId") int i, @Query("type") readStringList readstringlist);
}
