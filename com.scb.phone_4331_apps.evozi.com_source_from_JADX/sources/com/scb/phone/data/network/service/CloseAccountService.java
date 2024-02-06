package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.evictsBySize;
import p040o.hasMatte;
import p040o.loop;
import p040o.nullifyExpirable;
import p040o.rehash;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface CloseAccountService {
    @POST("v1/deposits/closeaccount/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<hasMatte>> closeAccount(@Header("otp") String str, @Header("tokenUUID") String str2, @Body nullifyExpirable nullifyexpirable);

    @POST("v2/deposits/closeaccount/verification")
    DebitCardResetOtpActivity<SingleDataEntity<loop>> closeAccountVerification(@Body evictsBySize evictsbysize);

    @POST("v2/deposits/closeaccount/validations/eligibility")
    DebitCardResetOtpActivity<SingleDataEntity<loop>> validateEligibility(@Body rehash rehash);
}
