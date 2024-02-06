package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableMultiset;
import p040o.setHardwareAccelerationEnabled;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PromptPayService {
    @GET("/v1/transfer/request/qr")
    DebitCardResetOtpActivity<SingleDataEntity<setHardwareAccelerationEnabled>> getPromptPayQR();

    @POST("/v1/transfer/request/qr")
    DebitCardResetOtpActivity<SingleDataEntity<setHardwareAccelerationEnabled>> getQRCode(@Body ImmutableMultiset.FieldSettersHolder fieldSettersHolder);
}
