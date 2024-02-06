package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.C10833element;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingQueue;
import p040o.ForwardingSet;
import p040o.LinkedHashTreeMap;
import p040o.close;
import p040o.findByEntry;
import p040o.findByObject;
import p040o.nextNonWhitespace;
import p040o.rebalance;
import p040o.replaceInParent;
import p040o.secondaryHash;
import p040o.setCurrentItemInternal;
import p040o.standardOffer;
import p040o.standardPoll;
import p040o.standardSetCount;
import p040o.writeReplace;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface MerchantWalletService {
    @POST("/v2/merchants/termsandcondition")
    DebitCardResetOtpActivity<setCurrentItemInternal> acceptMerchantTermsAndConditions(@Body standardSetCount standardsetcount);

    @PUT("v1/merchants/accounts")
    DebitCardResetOtpActivity<SingleDataEntity<close>> changeMerchantAccount(@Header("tokenUUID") String str, @Header("otpKey") String str2, @Header("otp") String str3, @Body standardPoll standardpoll);

    @POST("v1/merchants/request/qr")
    DebitCardResetOtpActivity<SingleDataEntity<replaceInParent>> createQr(@Body ForwardingQueue forwardingQueue);

    @PUT("v1/merchants/accounts")
    DebitCardResetOtpActivity<setCurrentItemInternal> editMerchantAccount(@Body standardPoll standardpoll);

    @GET("/v1/merchants/onboarding/checkaccounteligibility")
    DebitCardResetOtpActivity<setCurrentItemInternal> getCheckAccountEligibility();

    @GET("v1/merchants/landing")
    DebitCardResetOtpActivity<SingleDataEntity<rebalance>> getMerchantLanding();

    @GET("/v1/merchants/static")
    DebitCardResetOtpActivity<SingleDataEntity<LinkedHashTreeMap>> getMerchantStatic(@Query("type") String str, @Query("subtype") String str2);

    @GET("/v1/staticcontents/termsandconditions/merchantapp/latest")
    DebitCardResetOtpActivity<writeReplace> getMerchantTermsAndConditions();

    @GET("v1/merchants/shopinfo")
    DebitCardResetOtpActivity<SingleDataEntity<findByEntry>> getShopInfo();

    @GET("v1/merchants/accounts/addresses")
    DebitCardResetOtpActivity<SingleDataEntity<findByObject>> getStandAloneAddress();

    @GET("/v1/merchants/onboarding/validatemerchant")
    DebitCardResetOtpActivity<setCurrentItemInternal> getValidateMerchant();

    @POST("v1/merchants/onboarding/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<secondaryHash>> reviewConfirmation(@Body standardOffer standardoffer);

    @PUT("v2/profiles/accounts/registered")
    DebitCardResetOtpActivity<setCurrentItemInternal> saveMerchantNickname(@Body ForwardingSet forwardingSet);

    @POST("v1/merchants/onboarding/verification")
    DebitCardResetOtpActivity<SingleDataEntity<nextNonWhitespace>> verificationBankAccount(@Body C10833element element);
}
