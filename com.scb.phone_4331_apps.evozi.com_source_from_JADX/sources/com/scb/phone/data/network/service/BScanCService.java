package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.ComputingConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.encodedPassword;
import p040o.encodedPath;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface BScanCService {
    @POST("/v1/qr/bscanc/generate")
    DebitCardResetOtpActivity<SingleDataEntity<encodedPassword>> checkEntryPoint();

    @GET("/v1/qr/bscanc/settings")
    DebitCardResetOtpActivity<SingleDataEntity<encodedPath>> getQrToPay();

    @PUT("/v1/qr/bscanc/settings")
    DebitCardResetOtpActivity<SingleDataEntity<encodedPath>> putQrToPay(@Header("otp") String str, @Header("tokenUUID") String str2, @Body ComputingConcurrentHashMap.ComputationExceptionReference computationExceptionReference);
}
