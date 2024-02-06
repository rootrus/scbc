package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ExceptionParser;
import p040o.HashBiMap;
import p040o.HashMultimap;
import p040o.MiscUtils;
import p040o.floorDiv;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NsipPartnerPaymentService {
    @POST("/v1/partnerpayment/transfer/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<ExceptionParser>> getPartnerPaymentConfirm(@Body HashMultimap hashMultimap, @Header("otp") String str, @Header("tokenUUID") String str2);

    @GET("/v1/cta/partnerpayment/ms/merchantdata/id/{deepLinkId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<MiscUtils>> getPartnerPaymentId(@Path("deepLinkId") String str);

    @POST("/v1/partnerpayment/transfer/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<floorDiv>> getPartnerPaymentVerification(@Body HashBiMap hashBiMap);
}
