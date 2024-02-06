package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.AdvertisingIdClient;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.EmptyImmutableListMultimap;
import p040o.EmptyImmutableSortedSet;
import p040o.EnumMultiset;
import p040o.EvictionListeners;
import p040o.ExplicitOrderedImmutableSortedSet;
import p040o.FileExtension;
import p040o.FlexboxLayoutManager;
import p040o.Layer;
import p040o.ReserveIntents;
import p040o.TextLayer;
import p040o.applyJustification;
import p040o.asynchronous;
import p040o.createSubset;
import p040o.drawCharacter;
import p040o.drawFontTextLine;
import p040o.drawGlyph;
import p040o.drawTextWithFont;
import p040o.getContentsForCharacter;
import p040o.getTextLines;
import p040o.getTimeRemapping;
import p040o.getTimeStretch;
import p040o.inferKeyType;
import p040o.inferValueType;
import p040o.isModifier;
import p040o.keyType;
import p040o.onEviction;
import p040o.rowKeySet;
import p040o.setCurrentItemInternal;
import p040o.setFlexLines;
import p040o.setVisible;
import p040o.tempExtension;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface SecuritiesService {
    @POST("/v1/securities/registrations/suitabilities/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<TextLayer.C38582>> confirmSuitabilityAssessment(@Body ExplicitOrderedImmutableSortedSet explicitOrderedImmutableSortedSet);

    @GET("/v1/securities/registrations/addresses")
    DebitCardResetOtpActivity<SingleDataEntity<getTimeStretch>> getAddresses();

    @GET("v1/securities/registrations/businessTypes")
    DebitCardResetOtpActivity<SingleDataEntity<TextLayer>> getBusinessList(@Query("occupationCode") String str);

    @GET("/v1/securities/registrations/creditLimit")
    DebitCardResetOtpActivity<SingleDataEntity<Layer.MatteType>> getCreditLimit();

    @POST("/v1/securities/registrations/identity/validation")
    DebitCardResetOtpActivity<SingleDataEntity<setFlexLines>> getIdentityValidation(@Body CustomConcurrentHashMap.WeakValueReference weakValueReference);

    @GET("/v1/securities/registrations/investmentObjectives")
    DebitCardResetOtpActivity<SingleDataEntity<getTimeRemapping>> getInvestmentObjectives();

    @GET("v1/securities/registrations/occupations")
    DebitCardResetOtpActivity<SingleDataEntity<applyJustification>> getOnboardingOccupationList();

    @GET("/v1/securities/registrations/personalInformation")
    DebitCardResetOtpActivity<SingleDataEntity<setVisible>> getPersonalInfo();

    @POST("/v1/securities/portfolio/details")
    DebitCardResetOtpActivity<SingleDataEntity<FlexboxLayoutManager>> getPortfolioDetails(@Body EmptyImmutableSortedSet emptyImmutableSortedSet);

    @GET("/v1/securities/registrations/accounts")
    DebitCardResetOtpActivity<SingleDataEntity<drawGlyph>> getRegistrationAccounts();

    @GET("/v1/securities/registrations/status")
    DebitCardResetOtpActivity<SingleDataEntity<AdvertisingIdClient>> getRegistrationsStatus();

    @GET("/v1/securities/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<drawCharacter>> getReviewInfo();

    @POST("/v1/securities/registrations/eligibilities")
    DebitCardResetOtpActivity<setCurrentItemInternal> getSCBSEligibilities(@Body onEviction oneviction);

    @GET("/v1/securities/registrations/stage")
    DebitCardResetOtpActivity<SingleDataEntity<drawFontTextLine>> getSCBSRegistrationStage();

    @GET("/v1/securities/registrations/investmentLevel")
    DebitCardResetOtpActivity<SingleDataEntity<getContentsForCharacter>> getSCBSRiskLevel();

    @GET("v1/securities/registrations/salaryRanges")
    DebitCardResetOtpActivity<SingleDataEntity<drawTextWithFont>> getSalaryRanges();

    @GET("/v1/securities/registrations/marketConduct")
    DebitCardResetOtpActivity<SingleDataEntity<tempExtension>> getScbsOnboardingProductCatalog();

    @GET("/v1/securities/registrations/sourceOfFunds")
    DebitCardResetOtpActivity<SingleDataEntity<getTextLines>> getSourceOfFunds();

    @GET("/v1/securities/registrations/suitabilities")
    DebitCardResetOtpActivity<SingleDataEntity<FileExtension>> getSuitabilities(@Query("level") String str, @Query("tileVersion") String str2);

    @GET("v1/securities/portfolio/summary")
    DebitCardResetOtpActivity<SingleDataEntity<ReserveIntents>> getSummary();

    @POST("/v1/securities/registrations/accounts")
    DebitCardResetOtpActivity<setCurrentItemInternal> registerAccount(@Body inferKeyType inferkeytype);

    @POST("/v1/securities/registrations/investmentInfo")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> registerInvestmentInfo(@Body asynchronous asynchronous);

    @POST("/v1/securities/registrations/mobileNumber")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> registerMobileNumber(@Body EmptyImmutableListMultimap emptyImmutableListMultimap);

    @POST("/v1/securities/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<isModifier>> registerSecurities(@Header("otp") String str, @Header("tokenUUID") String str2);

    @POST("/v1/securities/registrations/creditLimit")
    DebitCardResetOtpActivity<setCurrentItemInternal> setCreditLimit(@Body EvictionListeners evictionListeners);

    @POST("/v1/securities/registrations/maritalStatus")
    DebitCardResetOtpActivity<setCurrentItemInternal> setMaritalStatus(@Body EnumMultiset enumMultiset);

    @POST("/v1/securities/registrations/addresses")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitAddress(@Body keyType keytype);

    @POST("v1/securities/registrations/occupationInfo")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitCareerInfo(@Body inferValueType infervaluetype);

    @POST("/v1/securities/registrations/fatca")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> submitFATCA(@Body rowKeySet rowkeyset);

    @POST("/v1/securities/registrations/suitabilities/validation")
    DebitCardResetOtpActivity<setCurrentItemInternal> validateSuitabilityAssessment(@Body createSubset createsubset);
}
