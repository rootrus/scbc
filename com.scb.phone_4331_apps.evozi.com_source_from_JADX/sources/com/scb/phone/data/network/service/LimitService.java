package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.PolystarShapeParser;
import p040o.parseLayers;
import p040o.setCurrentItemInternal;
import p040o.standardToString;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface LimitService {
    @GET("v2/profiles/limits?limitType=PER_CUSTOMER_PER_DAY")
    DebitCardResetOtpActivity<parseLayers> getPersonalLimit();

    @GET("v1/profiles/limits/usage?limitType=PER_CUSTOMER_PER_DAY")
    DebitCardResetOtpActivity<SingleDataEntity<PolystarShapeParser>> getPersonalLimitUsage(@Query("function") String str, @Query("subFunction") String str2);

    @PUT("v1/profiles/limits")
    DebitCardResetOtpActivity<setCurrentItemInternal> putPersonalLimit(@Header("tokenUUID") String str, @Header("otp") String str2, @Body standardToString standardtostring);
}
