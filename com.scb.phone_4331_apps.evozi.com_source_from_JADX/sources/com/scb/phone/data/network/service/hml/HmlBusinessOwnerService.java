package com.scb.phone.data.network.service.hml;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.ActivityTransitionEvent;
import p040o.AnimatableTransform;
import p040o.AnimatableValue;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CircleShape;
import p040o.ColorKeyframeAnimation;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.DocumentData;
import p040o.FloatKeyframeAnimation;
import p040o.IntegerKeyframeAnimation;
import p040o.KeyframeAnimation;
import p040o.LottieCompositionFactory;
import p040o.MaskKeyframeAnimation;
import p040o.MergePathsContent;
import p040o.ModifierContent;
import p040o.PointKeyframeAnimation;
import p040o.SimpleLottieValueCallback;
import p040o.TextKeyframeAnimation;
import p040o.TransformKeyframeAnimation;
import p040o.addAnimationsToLayer;
import p040o.addUpdateListener;
import p040o.defaultEquivalence;
import p040o.getAnchorPoint;
import p040o.getCurrentKeyframe;
import p040o.getEndOpacity;
import p040o.getFontFamily;
import p040o.getMaskAnimations;
import p040o.getMatrixForRepeater;
import p040o.getSize;
import p040o.getStartDelayProgress;
import p040o.getStartOpacity;
import p040o.getVertex;
import p040o.incrementDepthBy;
import p040o.isContainer;
import p040o.setControlPoint1;
import p040o.setControlPoint2;
import p040o.setCurrentItemInternal;
import p040o.toContent;
import p040o.zzlv;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HmlBusinessOwnerService {
    @POST("v1/bizloanorigination/applications/businessInfo/operatingAccount")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<addUpdateListener>> addOperatingAccount(@Body getStartDelayProgress getstartdelayprogress);

    @POST("v1/bizloanorigination/simulator/calculate")
    DebitCardResetOtpActivity<SingleDataEntity<MaskKeyframeAnimation>> calulateLoan(@Body CustomConcurrentHashMap.Segment.ExpirationQueue.C32991 r1);

    @GET("v1/bizloanorigination/setup/check-prerequisite")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<IntegerKeyframeAnimation>> checkPrerequisite(@Query("applicationUuid") String str);

    @POST("v1/bizloanorigination/setup/details")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> confirmSetup(@Body getMaskAnimations getmaskanimations);

    @HTTP(hasBody = true, method = "DELETE", path = "/v1/bizloanorigination/applications/documents")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteDocument(@Body zzlv zzlv);

    @HTTP(hasBody = true, method = "DELETE", path = "v1/bizloanorigination/applications/businessInfo/operatingAccount")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> deleteOperatingAccount(@Body addAnimationsToLayer addanimationstolayer);

    @PUT("v1/bizloanorigination/applications/businessInfo/operatingAccount")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> editOperatingAccount(@Body addAnimationsToLayer addanimationstolayer);

    @POST("v1/bizloanorigination/setup/email/generateOTP")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<TransformKeyframeAnimation>> generateOTP(@Body isContainer iscontainer);

    @GET("/v1/bizloanorigination/applications")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<toContent>> getApplications(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/applications/documents/instruction/{documentCode}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<TextKeyframeAnimation>> getBusinessDocumentInstructions(@Path("documentCode") String str);

    @GET("v1/customer/businessTypes")
    DebitCardResetOtpActivity<SingleDataEntity<FloatKeyframeAnimation>> getBusinessIndustrySelection();

    @GET("v1/bizloanorigination/applications/businessInfo/businessTypeDetails")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<ColorKeyframeAnimation>> getBusinessInfo(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/applications/businessInfo/storeDetails")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<CircleShape>> getBusinessInfoStoreDetails(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/applications/documents")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurrentKeyframe>> getBusinessOwnerDocumentList(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/applications/documents/resubmission")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurrentKeyframe>> getBusinessOwnerDocumentResubmissionList(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/applications/businessInfo/businessProfileDetails")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<MergePathsContent.C36531>> getBusinessProfileInfo(@Query("applicationUuid") String str);

    @GET("/v1/bizloanorigination/service/businessName")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<KeyframeAnimation>> getCompanyFirstPage();

    @GET("/v1/bizloanorigination/applications/consent/details/{documentType}")
    DebitCardResetOtpActivity<SingleDataEntity<SimpleLottieValueCallback>> getConsent(@Path("documentType") String str, @Query("productType") String str2, @Query("applicationUuid") String str3);

    @GET("/v1/bizloanorigination/applications/etb/customer/contacts")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<AnimatableTransform>> getContactInfo(@Query("applicationUuid") String str);

    @GET("/v1/bizloanorigination/applications/documentsbytype")
    DebitCardResetOtpActivity<SingleDataEntity<PointKeyframeAnimation>> getDocumentsByType(@Query("applicationUuid") String str, @Query("documentCode") String str2);

    @GET("v1/bizloanorigination/outcome")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getFontFamily>> getOutcome(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/setup/details")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<DocumentData.Justification>> getSetupDetails(@Query("applicationUuid") String str);

    @GET("v1/bizloanorigination/setup/email")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getEndOpacity>> getSetupEmail(@Query("applicationUuid") String str);

    @GET("v1/cta/bizloanorigination/applications/requestedProduct/latest")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<AnimatableValue>> getSummaryRequestedProduct();

    @GET("v1/bizloanorigination/setup/result")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getSize>> hmlSetupResult(@Query("applicationUuid") String str);

    @POST("v1/bizloanorigination/applications/etb/customer/initiate")
    DebitCardResetOtpActivity<SingleDataEntity<getStartOpacity>> initiate(@Body CustomConcurrentHashMap.SoftExpirableEntry softExpirableEntry);

    @POST("v1/bizloanorigination/applications/submission")
    DebitCardResetOtpActivity<SingleDataEntity<getVertex>> otpBusinessOwnerSubmission(@Header("otp") String str, @Header("tokenUUID") String str2, @Body setControlPoint2 setcontrolpoint2);

    @POST("v1/bizloanorigination/setup/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> otpConfirmation(@Header("otp") String str, @Header("tokenUUID") String str2, @Body setControlPoint1 setcontrolpoint1);

    @POST("/v1/bizloanorigination/applications/businessInfo/businessProfileDetails")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postBusinessProfileInfo(@Body ModifierContent modifierContent);

    @POST("/v1/bizloanorigination/simulator")
    DebitCardResetOtpActivity<SingleDataEntity<getMatrixForRepeater>> postLandingInfo(@Body CustomConcurrentHashMap.SoftEvictableEntry softEvictableEntry);

    @POST("v1/bizloanorigination/applications/businessInfo/businessTypeDetails")
    DebitCardResetOtpActivity<setCurrentItemInternal> sendBusinessInfo(@Body CustomConcurrentHashMap.Segment.EvictionQueue.C33011 r1);

    @POST("v1/bizloanorigination/applications/businessInfo/storeDetails")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> sendBusinessInfoStoreDetails(@Body CustomConcurrentHashMap.SerializationProxy serializationProxy);

    @POST("/v1/bizloanorigination/applications/consent/details/{documentType}/acceptance")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitBusinessOwnerConsent(@Path("documentType") String str, @Body CustomConcurrentHashMap.Strength strength);

    @POST("v1/bizloanorigination/applications/resubmission")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> submitBusinessOwnerResubmissionDocuments(@Body defaultEquivalence defaultequivalence);

    @POST("v1/bizloanorigination/applications/etb/customer/contacts")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateContactInfo(@Body ActivityTransitionEvent activityTransitionEvent);

    @POST("v1/bizloanorigination/outcome/acceptance")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> updateOfferAcceptance(@Body getAnchorPoint getanchorpoint);

    @POST("/v1/bizloanorigination/applications/documents")
    @Multipart
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C36086>> uploadDocument(@Part("applicationUuid") RequestBody requestBody, @Part("documentType") RequestBody requestBody2, @Part("productType") RequestBody requestBody3, @Part("documentPassword") RequestBody requestBody4, @Part("isBlurry") RequestBody requestBody5, @Part("isMissingBorders") RequestBody requestBody6, @Part("isLowContrastBackground") RequestBody requestBody7, @Part("isOverSaturated") RequestBody requestBody8, @Part("isUnderSaturated") RequestBody requestBody9, @Part("uploadMethod") RequestBody requestBody10, @Part("documentName") RequestBody requestBody11, @Part("latitude") RequestBody requestBody12, @Part("longitude") RequestBody requestBody13, @Part("createdDatetime") RequestBody requestBody14, @Part MultipartBody.Part part);

    @POST("v1/bizloanorigination/setup/email/verifyOTP")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> verifyOTP(@Header("tokenUuid") String str, @Header("otp") String str2, @Body incrementDepthBy incrementdepthby);
}
