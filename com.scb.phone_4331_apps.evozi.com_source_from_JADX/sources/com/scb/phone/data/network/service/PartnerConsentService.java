package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.getMean;
import p040o.maximumSize;
import p040o.softValues;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PartnerConsentService {
    @GET("partners/v3/consent/{sessionId}")
    DebitCardResetOtpActivity<SingleDataEntity<getMean>> getPartnerConsent(@Path("sessionId") String str);

    @GET("partners/v3/consent/transactions/{transactionId}")
    DebitCardResetOtpActivity<SingleDataEntity<getMean>> getPartnerConsentWithTransactionId(@Path("transactionId") String str);

    @POST("partners/v3/consent")
    DebitCardResetOtpActivity<SingleDataEntity<getMean>> postPartnerConsent(@Body maximumSize maximumsize);

    @POST("partners/v3/consent/transactions")
    DebitCardResetOtpActivity<SingleDataEntity<getMean>> postPartnerConsentWithTransactionId(@Body softValues softvalues);

    @PUT("partners/v3/consent")
    DebitCardResetOtpActivity<SingleDataEntity<getMean>> putPartnerConsent(@Body maximumSize maximumsize);

    @PUT("partners/v3/consent/transactions")
    DebitCardResetOtpActivity<SingleDataEntity<getMean>> putPartnerConsentWithTransactionId(@Body softValues softvalues);
}
