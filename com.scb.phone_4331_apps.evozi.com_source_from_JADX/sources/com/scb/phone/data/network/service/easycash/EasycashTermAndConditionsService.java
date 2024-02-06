package com.scb.phone.data.network.service.easycash;

import p040o.DebitCardResetOtpActivity;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EasycashTermAndConditionsService {
    @GET("/v1/lending/document")
    DebitCardResetOtpActivity<String> getTermsConditions(@Query("documentType") String str, @Query("productType") String str2, @Query("uuid") String str3);

    @GET("/v1/lending/document?isReferral=1")
    DebitCardResetOtpActivity<String> getTermsConditionsReferral(@Query("documentType") String str, @Query("productType") String str2, @Query("phone") String str3, @Query("uuid") String str4);

    @GET("/v1/lending/document?isReferral=0")
    DebitCardResetOtpActivity<String> getTermsConditionsReferralUnsecured(@Query("documentType") String str, @Query("productType") String str2, @Query("phone") String str3, @Query("uuid") String str4);
}
