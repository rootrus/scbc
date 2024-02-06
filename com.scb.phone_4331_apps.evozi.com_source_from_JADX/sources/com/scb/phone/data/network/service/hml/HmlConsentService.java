package com.scb.phone.data.network.service.hml;

import p040o.DebitCardResetOtpActivity;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HmlConsentService {
    @GET("/v1/loanorigination/applications/consent/details/{documentType}")
    DebitCardResetOtpActivity<String> getConsent(@Path("documentType") String str, @Query("productType") String str2, @Query("applicationUuid") String str3);
}
