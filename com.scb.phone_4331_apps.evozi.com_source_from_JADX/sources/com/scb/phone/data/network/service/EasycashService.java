package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.ResponseBody;
import p040o.Action;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieCompositionFactory;
import p040o.LottieDrawable;
import p040o.LottieResult;
import p040o.SimpleLottieValueCallback;
import p040o.addListener;
import p040o.call;
import p040o.copyEvictableEntry;
import p040o.drainRecencyQueue;
import p040o.enqueueCleanup;
import p040o.fromZipStreamSyncInternal;
import p040o.getException;
import p040o.getIntrinsicHeight;
import p040o.getIntrinsicWidth;
import p040o.getNextEvictable;
import p040o.getOpacity;
import p040o.getPreviousEvictable;
import p040o.getValueReference;
import p040o.isNightMode;
import p040o.notifyKeyReclaimed;
import p040o.notifyListeners;
import p040o.notifySuccessListeners;
import p040o.onAnimationUpdate;
import p040o.removeListener;
import p040o.scheduleDrawable;
import p040o.setCurrentItemInternal;
import p040o.setNextExpirable;
import p040o.setPreviousEvictable;
import p040o.setPreviousExpirable;
import p040o.setSystemAnimationsAreEnabled;
import p040o.start;
import p040o.unscheduleDrawable;
import p040o.updateBounds;
import p040o.zzlx;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EasycashService {
    @POST("/v1/lending/documents/accounts")
    DebitCardResetOtpActivity<setCurrentItemInternal> additionDocumentScbAccount(@Body CustomConcurrentHashMap.EntryFactory.C32966 r1);

    @POST("/v1/lending/creditpower/calculation")
    DebitCardResetOtpActivity<SingleDataEntity<getIntrinsicHeight>> calculateCreditPower(@Body CustomConcurrentHashMap.EntryFactory.C32913 r1);

    @POST("/v1/lending/mortgage/calculation")
    DebitCardResetOtpActivity<SingleDataEntity<removeListener>> calculateMortgageLoan(@Body getNextEvictable getnextevictable);

    @POST("/v1/lending/purposeful/calculation")
    DebitCardResetOtpActivity<SingleDataEntity<removeListener>> calculatePurposefulLoan(@Body getValueReference getvaluereference);

    @POST("/v1/lending/mortgage/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<isNightMode>> confirmMortgageLoan(@Body copyEvictableEntry copyevictableentry);

    @POST("/v1/lending/ntb/referral/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmNTBReferral(@Body setNextExpirable setnextexpirable);

    @POST("/v1/lending/purposeful/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<isNightMode>> confirmPurposefulLoan(@Body copyEvictableEntry copyevictableentry);

    @POST("/v1/lending/referral/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmReferral(@Body setNextExpirable setnextexpirable);

    @POST("/v1/lending/commercial/referral/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmReferralCommercialLoan(@Body setNextExpirable setnextexpirable);

    @HTTP(hasBody = true, method = "DELETE", path = "/v1/lending/documents/upload")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteAdditionDocument(@Body zzlx zzlx);

    @HTTP(hasBody = true, method = "DELETE", path = "v1/lending/issuer")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteIssuer(@Body CustomConcurrentHashMap.EntryIterator entryIterator);

    @GET("/v1/lending/creditpower/landing")
    DebitCardResetOtpActivity<SingleDataEntity<updateBounds>> getCreditPowerLanding(@Query("tilesVersion") String str);

    @GET("/v2/lending/customer/contacts")
    DebitCardResetOtpActivity<SingleDataEntity<fromZipStreamSyncInternal>> getCustomerContactInformation(@Query("applicationId") String str, @Query("productType") String str2, @Query("tilesVersion") String str3);

    @GET("/v1/lending/document-type/{productType}")
    DebitCardResetOtpActivity<SingleDataEntity<LottieDrawable>> getDocumentType(@Path("productType") String str);

    @GET("/v2/lending/documents/upload")
    DebitCardResetOtpActivity<SingleDataEntity<Action>> getDocumentUploaded(@Query("applicationId") String str, @Query("productType") String str2);

    @GET("/v1/lending/product/{productType}")
    DebitCardResetOtpActivity<SingleDataEntity<call>> getEasycashDeeplink(@Path("productType") String str, @Query("tilesVersion") String str2);

    @GET("/v1/lending/issuer/reference/institutions")
    DebitCardResetOtpActivity<SingleDataEntity<unscheduleDrawable>> getEasycashInstitutionsList();

    @GET("/v1/lending/introductions/{productType}")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C360311>> getEasycashIntroductions(@Path("productType") String str);

    @GET("/v1/lending/issuer/reference/loantypes")
    DebitCardResetOtpActivity<SingleDataEntity<setSystemAnimationsAreEnabled>> getEasycashLoanTypesList();

    @GET("/v1/lending/list")
    DebitCardResetOtpActivity<SingleDataEntity<onAnimationUpdate>> getEasycashLoansList(@Query("tilesVersion") String str);

    @GET("/v1/lending/ntb/list")
    DebitCardResetOtpActivity<SingleDataEntity<onAnimationUpdate>> getEasycashNtbLoansList(@Query("tilesVersion") String str);

    @GET("/v1/lending/salesheets")
    DebitCardResetOtpActivity<SingleDataEntity<addListener>> getEasycashSalesheets(@Query("tilesVersion") String str);

    @GET("/v1/lending/issuer")
    DebitCardResetOtpActivity<SingleDataEntity<start>> getLendingIssuer(@Query("applicationId") String str);

    @GET("/v1/lending/mortgage/offers/{productType}")
    DebitCardResetOtpActivity<SingleDataEntity<LottieResult>> getMortgageTopupOffers(@Path("productType") String str, @Query("ncbTransactionId") String str2, @Query("tilesVersion") String str3);

    @POST("/v1/lending/creditpower/ncbinquiry")
    DebitCardResetOtpActivity<SingleDataEntity<getIntrinsicWidth>> getNCBInquiry(@Body CustomConcurrentHashMap.EntryFactory.C32924 r1);

    @POST("/v1/lending/document/ncb/multiproduct")
    DebitCardResetOtpActivity<ResponseBody> getNcbMultiproduct(@Body getPreviousEvictable getpreviousevictable);

    @GET("/v1/lending/customer/occupation")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C36042>> getOccupationInfo(@Query("applicationId") String str);

    @GET("/v1/lending/purposeful/offers/{productType}")
    DebitCardResetOtpActivity<SingleDataEntity<getException>> getPurposefulLoanOffers(@Path("productType") String str, @Query("tilesVersion") String str2, @Query("monthlyIncome") String str3);

    @GET("/v1/lending/request-info/income")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C36064>> getRequestInfoIncome(@Query("productType") String str, @Query("productProgram") String str2, @Query("tilesVersion") String str3);

    @GET("/v2/lending/required-document")
    DebitCardResetOtpActivity<SingleDataEntity<SimpleLottieValueCallback>> getTermsConditionsRequiredDocument(@Query("documentType") String str, @Query("productType") String str2, @Query("productProgram") String str3, @Query("uuid") String str4, @Query("tilesVersion") String str5);

    @POST("/v1/lending/ntb/referral/landing")
    DebitCardResetOtpActivity<SingleDataEntity<notifySuccessListeners>> landingNTBReferral(@Body CustomConcurrentHashMap.ReferenceEntry referenceEntry);

    @POST("/v1/lending/customer/occupation")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C36053>> postOccupation(@Body notifyKeyReclaimed notifykeyreclaimed);

    @POST("/v1/lending/creditpower/loan-request")
    DebitCardResetOtpActivity<SingleDataEntity<getOpacity>> requestCreditPowerLoan(@Body CustomConcurrentHashMap.EntryFactory.C32935 r1);

    @POST("/v1/lending/customer/contacts")
    DebitCardResetOtpActivity<setCurrentItemInternal> saveCustomerContactInformation(@Body CustomConcurrentHashMap.EntryFactory.C328912 r1);

    @POST("/v1/lending/issuer")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitLendingIssuer(@Body CustomConcurrentHashMap.KeySet keySet);

    @POST("/v1/lending/documents/upload/validation")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> uploadValidation(@Body CustomConcurrentHashMap.EntryFactory.C32948 r1);

    @GET("/v1/lending/commercial/eligibility")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C361110>> validateCommercialEligibility(@Query("tilesVersion") String str);

    @GET("/v1/lending/mortgage/eligibility")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C361110>> validateMortgageEligibility(@Query("productType") String str, @Query("tilesVersion") String str2);

    @GET("/v1/lending/referral/eligibility")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C361110>> validateReferralEligibility(@Query("productType") String str);

    @POST("/v1/lending/commercial/referral/verification")
    DebitCardResetOtpActivity<SingleDataEntity<notifyListeners>> verifyCommercialReferral(@Body setPreviousExpirable setpreviousexpirable);

    @POST("/v1/lending/mortgage/features")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyMortgageFeatures(@Body enqueueCleanup enqueuecleanup);

    @POST("/v1/lending/ntb/referral/verification")
    DebitCardResetOtpActivity<SingleDataEntity<notifyListeners>> verifyNTBReferral(@Body setPreviousEvictable setpreviousevictable);

    @POST("/v1/lending/purposeful/features")
    DebitCardResetOtpActivity<SingleDataEntity<scheduleDrawable>> verifyPurposefulFeatures(@Body drainRecencyQueue drainrecencyqueue);

    @POST("/v1/lending/referral/verification")
    DebitCardResetOtpActivity<SingleDataEntity<notifyListeners>> verifyReferral(@Body setPreviousExpirable setpreviousexpirable);
}
