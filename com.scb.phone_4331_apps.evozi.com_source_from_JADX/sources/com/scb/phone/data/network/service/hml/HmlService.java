package com.scb.phone.data.network.service.hml;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.AnimatableColorValue;
import p040o.AnimatableScaleValue;
import p040o.AnimatableShapeValue;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C9939filter;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.DocumentData;
import p040o.GradientColor;
import p040o.IntegerKeyframeAnimation;
import p040o.KeyframeAnimation;
import p040o.MaskKeyframeAnimation;
import p040o.PointKeyframeAnimation;
import p040o.PolystarContent;
import p040o.RepeaterContent;
import p040o.ShapeContent;
import p040o.ShapeKeyframeAnimation;
import p040o.SimpleLottieValueCallback;
import p040o.TextKeyframeAnimation;
import p040o.TransformKeyframeAnimation;
import p040o.ValueCallbackKeyframeAnimation;
import p040o.addKey;
import p040o.clearSkewValues;
import p040o.createPath;
import p040o.endsWithGlobstar;
import p040o.getAnchorPoint;
import p040o.getControlPoint2;
import p040o.getCurrentKeyframe;
import p040o.getEndOpacity;
import p040o.getFamily;
import p040o.getFontFamily;
import p040o.getKeyframes;
import p040o.getLinearCurrentKeyframeProgress;
import p040o.getMaskAnimations;
import p040o.getMatrix;
import p040o.getMatrixForRepeater;
import p040o.getShapes;
import p040o.getSize;
import p040o.getStart;
import p040o.getStartOpacity;
import p040o.getVertex;
import p040o.hasResult;
import p040o.hasSameContext;
import p040o.hashFor;
import p040o.incrementDepthBy;
import p040o.isContainer;
import p040o.isReversed;
import p040o.keysToString;
import p040o.putBitmap;
import p040o.setControlPoint1;
import p040o.setControlPoint2;
import p040o.setCurrentItemInternal;
import p040o.start;
import p040o.typefaceForStyle;
import p040o.zzcz;
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

public interface HmlService {
    @POST("v1/loanorigination/product/simulator/calculate")
    DebitCardResetOtpActivity<SingleDataEntity<MaskKeyframeAnimation>> calulateLoan(@Body CustomConcurrentHashMap.Segment.ExpirationQueue.C32991 r1);

    @GET("v1/loanorigination/setup/check-prerequisite")
    DebitCardResetOtpActivity<SingleDataEntity<IntegerKeyframeAnimation>> checkPrerequisite(@Query("applicationUuid") String str);

    @POST("/v1/loanorigination/ekyc/{ekycMethod}/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> completeSubmission(@Path("ekycMethod") String str, @Body isContainer iscontainer);

    @POST("v1/loanorigination/setup/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmLoan(@Header("tokenUuid") String str, @Header("otp") String str2, @Body isContainer iscontainer);

    @POST("v1/loanorigination/setup/details")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmSetup(@Body getMaskAnimations getmaskanimations);

    @HTTP(hasBody = true, method = "DELETE", path = "/v1/loanorigination/applications/documents")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteDocument(@Body zzlv zzlv);

    @HTTP(hasBody = true, method = "DELETE", path = "v1/loanorigination/applications/issuers")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteIssuer(@Body CustomConcurrentHashMap.Segment.ExpirationQueue.C33002 r1);

    @POST("v1/loanorigination/email/generateOTP")
    DebitCardResetOtpActivity<SingleDataEntity<TransformKeyframeAnimation>> generateOTP(@Body isContainer iscontainer);

    @GET("/v2/loanorigination/applications")
    DebitCardResetOtpActivity<SingleDataEntity<getLinearCurrentKeyframeProgress>> getApplications(@Query("applicationUuid") String str, @Query("tilesVersion") String str2);

    @GET("/v1/customer/enlite/company/findByName")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<KeyframeAnimation>> getCompanyFirstPage(@Query("companyName") String str);

    @GET("/v1/customer/enlite/company/findByName")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<KeyframeAnimation>> getCompanyPage(@Query("companyName") String str, @Query("pageNumber") String str2);

    @GET("/v2/loanorigination/applications/consent/details/{documentType}")
    DebitCardResetOtpActivity<SingleDataEntity<SimpleLottieValueCallback>> getConsent(@Path("documentType") String str, @Query("productType") String str2, @Query("applicationUuid") String str3, @Query("tilesVersion") String str4, @Query("subConsentType") String str5);

    @GET("v1/loanorigination/applications/customer/contacts")
    DebitCardResetOtpActivity<SingleDataEntity<PolystarContent.C37331>> getContactInfo(@Query("applicationUuid") String str);

    @GET("v1/loanorigination/applications/documents/instruction/{documentCode}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<TextKeyframeAnimation>> getDocumentInstructions(@Path("documentCode") String str);

    @GET("/v2/loanorigination/applications/documents")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurrentKeyframe>> getDocuments(@Query("applicationUuid") String str);

    @GET("/v1/loanorigination/applications/documentsbytype")
    DebitCardResetOtpActivity<SingleDataEntity<PointKeyframeAnimation>> getDocumentsByType(@Query("applicationUuid") String str, @Query("documentCode") String str2);

    @GET("/v1/loanorigination/applications/documents/resubmission")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurrentKeyframe>> getDocumentsResubmitted(@Query("applicationUuid") String str);

    @GET("/v1/cta/loanorigination/applications/documents/id/{deepLinkId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurrentKeyframe>> getDocumentsWithDeepLink(@Path("deepLinkId") String str);

    @GET("/v1/cta/loanorigination/applications/documents/latest")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurrentKeyframe>> getDocumentsWithDeepLinkListById();

    @GET("v1/customer/educationLevels")
    DebitCardResetOtpActivity<SingleDataEntity<clearSkewValues>> getEducationLevels();

    @GET("v1/loanorigination/ekyc/methods")
    DebitCardResetOtpActivity<SingleDataEntity<addKey>> getEkycMethods(@Query("tilesVersion") String str);

    @POST("/v1/loanorigination/ekyc/{ekycMethod}/initiate")
    DebitCardResetOtpActivity<SingleDataEntity<getMatrix>> getIdentifySetup(@Path("ekycMethod") String str, @Body isContainer iscontainer);

    @GET("v1/loanorigination/applications/issuers")
    DebitCardResetOtpActivity<SingleDataEntity<start>> getLendingIssuer(@Query("applicationUuid") String str);

    @GET("v1/customer/maritalStatus")
    DebitCardResetOtpActivity<SingleDataEntity<AnimatableColorValue>> getMaritalStatus();

    @POST("v1/loanorigination/applications/ncb/acceptance")
    DebitCardResetOtpActivity<setCurrentItemInternal> getNCBAcceptance(@Header("tokenUuid") String str, @Header("otp") String str2, @Body CustomConcurrentHashMap.Strength strength);

    @POST("v1/loanorigination/ntb/entries")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<typefaceForStyle>> getNTBApplyLoanEntry(@Body hasSameContext hassamecontext);

    @GET("v1/loanorigination/ntb/applications/customer/contacts")
    DebitCardResetOtpActivity<SingleDataEntity<getKeyframes>> getNTBContactInfo();

    @GET("v1/loanorigination/applications/customer/occupation")
    DebitCardResetOtpActivity<SingleDataEntity<RepeaterContent>> getOccupation(@Query("applicationUuid") String str);

    @GET("/v3/loanorigination/offers")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getFontFamily>> getOffers(@Query("applicationUuid") String str, @Query("tilesVersion") String str2);

    @GET("v1/loanorigination/applications/customer/operatingAccount")
    DebitCardResetOtpActivity<SingleDataEntity<isReversed>> getOperatingAccount(@Query("applicationUuid") String str);

    @GET("/v1/loanorigination/applications/verifybypromptpay/status")
    DebitCardResetOtpActivity<SingleDataEntity<GradientColor>> getPromptPayVerificationStage(@Query("applicationUuid") String str);

    @GET("v1/customer/residentTypes")
    DebitCardResetOtpActivity<SingleDataEntity<AnimatableShapeValue>> getResidentTypeStatus();

    @GET("v2/loanorigination/setup/details")
    DebitCardResetOtpActivity<SingleDataEntity<DocumentData.Justification>> getSetupDetails(@Query("applicationUuid") String str);

    @GET("v1/loanorigination/setup/email")
    DebitCardResetOtpActivity<SingleDataEntity<getEndOpacity>> getSetupEmail(@Query("applicationUuid") String str);

    @GET("v1/loanorigination/product/supporting-document")
    DebitCardResetOtpActivity<SingleDataEntity<AnimatableScaleValue>> getSupportingDocumentType(@Query("productType") String str);

    @GET("v1/loanorigination/setup/accounts")
    DebitCardResetOtpActivity<SingleDataEntity<getFamily>> hmlSetupAccounts(@Query("applicationUuid") String str);

    @GET("v2/loanorigination/setup/result")
    DebitCardResetOtpActivity<SingleDataEntity<getSize>> hmlSetupResult(@Query("applicationUuid") String str);

    @POST("/v1/loanorigination/setup/{ekycMethod}/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<hashFor>> hmlTermsConditionsOTP(@Header("otp") String str, @Header("tokenUUID") String str2, @Path("ekycMethod") String str3, @Body isContainer iscontainer);

    @POST("/v1/loanorigination/ekyc/{ekycMethod}/cidphoto")
    @Multipart
    DebitCardResetOtpActivity<setCurrentItemInternal> hmlUploadCidPhoto(@Path("ekycMethod") String str, @Part("applicationUuid") RequestBody requestBody, @Part MultipartBody.Part part);

    @POST("v1/loanorigination/applications/initiate")
    DebitCardResetOtpActivity<SingleDataEntity<getStartOpacity>> initiate(@Body CustomConcurrentHashMap.SoftExpirableEntry softExpirableEntry);

    @POST("v1/loanorigination/offers/calculation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity> offerCalculation(@Body CustomConcurrentHashMap.Strength.C33031 r1);

    @POST("v2/loanorigination/setup/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> otpConfirmation(@Header("otp") String str, @Header("tokenUUID") String str2, @Body setControlPoint1 setcontrolpoint1);

    @POST("v2/loanorigination/applications/submission")
    DebitCardResetOtpActivity<SingleDataEntity<getVertex>> otpSubmission(@Header("otp") String str, @Header("tokenUUID") String str2, @Body setControlPoint2 setcontrolpoint2);

    @POST("v3/loanorigination/landing")
    DebitCardResetOtpActivity<SingleDataEntity<getMatrixForRepeater>> postLandingInfo(@Body CustomConcurrentHashMap.SoftEvictableEntry softEvictableEntry);

    @POST("/v1/loanorigination/applications/verifybypromptpay/verifycode")
    DebitCardResetOtpActivity<SingleDataEntity> promptpayVerifyCode(@Body getControlPoint2 getcontrolpoint2);

    @PUT("/v1/loanorigination/applications/consent/details/{documentType}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity> putConsentDocument(@Path("documentType") String str, @Body CustomConcurrentHashMap.Segment.ExpirationQueue expirationQueue);

    @POST("v1/loanorigination/applications/customer/operatingAccount")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> sendOperatingAccount(@Body CustomConcurrentHashMap.StrongExpirableEntry strongExpirableEntry);

    @POST("/v1/loanorigination/applications/verifybypromptpay/sendcode")
    DebitCardResetOtpActivity<setCurrentItemInternal> sendPromptPayCode(@Body isContainer iscontainer);

    @POST("v1/customer/ntb/setup/pin")
    DebitCardResetOtpActivity<setCurrentItemInternal> setupNTBPin(@Body CustomConcurrentHashMap.StrongEvictableEntry strongEvictableEntry);

    @POST("/v1/loanorigination/applications/issuers")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitLendingIssuer(@Body CustomConcurrentHashMap.SoftExpirableEvictableEntry softExpirableEvictableEntry);

    @POST("/v1/loanorigination/applications/resubmission")
    DebitCardResetOtpActivity<SingleDataEntity> submitResubmission(@Body getShapes getshapes);

    @POST("v2/loanorigination/applications/customer/contacts")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateContactInfo(@Body zzcz.zza zza);

    @POST("v2/loanorigination/ntb/applications/initiate")
    DebitCardResetOtpActivity<SingleDataEntity<putBitmap>> updateNTBContactInfo(@Body hasResult hasresult);

    @POST("v1/loanorigination/applications/customer/occupation")
    DebitCardResetOtpActivity<SingleDataEntity<getStart>> updateOccupation(@Body ShapeContent shapeContent);

    @POST("v1/loanorigination/offers/acceptance")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateOfferAcceptance(@Body getAnchorPoint getanchorpoint);

    @POST("/v1/loanorigination/applications/documents/validation")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> uploadValidation(@Body ShapeKeyframeAnimation shapeKeyframeAnimation);

    @POST("v1/loanorigination/ntb/continueOnMobile/validateOTA")
    DebitCardResetOtpActivity<SingleDataEntity<createPath>> validateOta(@Body endsWithGlobstar endswithglobstar, @Header("ota") String str);

    @POST("v1/loanorigination/ntb/continueOnMobile/validateOTP")
    DebitCardResetOtpActivity<SingleDataEntity<ValueCallbackKeyframeAnimation>> validateOtp(@Body C9939filter filter, @Header("tokenUuid") String str, @Header("otp") String str2);

    @GET("/v1/loanorigination/applications/verifybyekyc/status")
    DebitCardResetOtpActivity<SingleDataEntity<keysToString>> verifyByEkycStatus(@Query("applicationUuid") String str);

    @POST("v1/loanorigination/email/verifyOTP")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyOTP(@Header("tokenUuid") String str, @Header("otp") String str2, @Body incrementDepthBy incrementdepthby);
}
