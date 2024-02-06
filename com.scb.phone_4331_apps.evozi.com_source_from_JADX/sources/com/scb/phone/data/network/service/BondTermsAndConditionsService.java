package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BondTermsAndConditionsService {
    @GET("/v1/bonds/purchase/termsandcondition")
    DebitCardResetOtpActivity<String> getBondDltTermsAndConditions(@Query("fileVersion") String str);

    @GET("/v1/bonds/purchase/termsandcondition")
    DebitCardResetOtpActivity<String> getBondTermsAndConditions();
}
