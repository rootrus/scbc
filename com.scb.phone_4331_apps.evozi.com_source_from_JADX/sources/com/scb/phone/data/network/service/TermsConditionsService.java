package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.getIsAdIdFakeForDebugLogging;
import p040o.writeReplace;
import retrofit2.http.GET;

public interface TermsConditionsService {
    @GET("/v1/staticcontents/consents/addaccount/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getAddAccountConsents();

    @GET("/v1/staticcontents/termsandconditions/bankingagent/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getBankingAgentTC();

    @GET("/v1/staticcontents/termsandconditions/cardlessatm/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getCardlessTermsAndCondition();

    @GET("/v1/staticcontents/termsandconditions/creditcards/creditcardpayment/creditcard/latest/html")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getCcSofCreditCardTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/creditcards/creditcardpayment/speedycashcard/latest/html")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getCcSofSpeedyCardTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/creditcards/estatement/lates")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getCreditCardChangeChannelStatementTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/creditcards/rewardredemption/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getCreditCardRewardsTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/debitcards/request/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getDebitCardTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/merchantapp/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getMerchantAppTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/merchantapp/latest")
    DebitCardResetOtpActivity<writeReplace> getMerchantTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/mutualfund/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getMutualFundTermsAndConditions();

    @GET("/v1/staticcontents/consents/securities/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getSecuritiesConsents();

    @GET("/v1/staticcontents/termsandconditions/securities/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getSecuritiesTermsAndConditions();

    @GET("/v1/staticcontents/termsandconditions/travelcards/request/latest")
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getTravelCardTermsAndConditions();
}
