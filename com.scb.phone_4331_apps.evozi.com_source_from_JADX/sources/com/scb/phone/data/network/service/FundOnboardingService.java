package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.EmptyImmutableListMultimap;
import p040o.applySubtractMask;
import p040o.clearCanvas;
import p040o.getLayerModel;
import p040o.intersectBoundsWithMask;
import p040o.intersectBoundsWithMatte;
import p040o.rowKeySet;
import p040o.setCurrentItemInternal;
import p040o.setVisible;
import p040o.setupInOutAnimations;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface FundOnboardingService {
    @GET("v1/customer/individuals/titles")
    DebitCardResetOtpActivity<SingleDataEntity<applySubtractMask>> getCustomerIndividualsTitles();

    @GET("v1/mutualfunds/registrations/eligibilities")
    DebitCardResetOtpActivity<SingleDataEntity<intersectBoundsWithMask>> getEligibility();

    @GET("v1/mutualfunds/registrations/accounts")
    DebitCardResetOtpActivity<SingleDataEntity<clearCanvas>> getFundAccounts();

    @GET("/v1/mutualfunds/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<getLayerModel>> getRegistrations();

    @GET("v1/mutualfunds/registrations/addresses")
    DebitCardResetOtpActivity<SingleDataEntity<intersectBoundsWithMatte>> getRegistrationsAddresses();

    @GET("v1/mutualfunds/registrations/profiles")
    DebitCardResetOtpActivity<SingleDataEntity<setVisible>> getRegistrationsProfiles();

    @GET("v1/mutualfunds/registrations/sourceFundTypes")
    DebitCardResetOtpActivity<SingleDataEntity<clearCanvas>> getSourceFundTypes();

    @POST("v1/mutualfunds/registrations/addresses")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitAddressInformationFundAppForm(@Body CustomConcurrentHashMap.WeakExpirableEvictableEntry weakExpirableEvictableEntry);

    @POST("v1/mutualfunds/registrations/fatca")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitFatca(@Body rowKeySet rowkeyset);

    @POST("v1/mutualfunds/registrations/accounts")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitFundAccount(@Body CustomConcurrentHashMap.WriteThroughEntry writeThroughEntry);

    @POST("v1/mutualfunds/registrations/sourceFundTypes")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitFundSource(@Body CustomConcurrentHashMap.WriteThroughEntry writeThroughEntry);

    @POST("v1/mutualfunds/registrations/investmentInfo")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitInvestmentExperience(@Body CustomConcurrentHashMap.WriteThroughEntry writeThroughEntry);

    @POST("v1/mutualfunds/registrations/mobileNumber")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitMobileNumberPersonalInfo(@Body EmptyImmutableListMultimap emptyImmutableListMultimap);

    @POST("/v1/mutualfunds/registrations/maritalStatus")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitRegistrationsMaritalStatus(@Body CustomConcurrentHashMap.WeakExpirableEntry weakExpirableEntry);

    @POST("/v1/mutualfunds/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<setupInOutAnimations>> verifyOtp(@Header("tokenUUID") String str, @Header("otp") String str2);
}
