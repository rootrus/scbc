package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.isStatic;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface NTBPinLoginService {
    @POST("v1/customer/ntb/verify/pin")
    DebitCardResetOtpActivity<SingleDataEntity<HmlVerifyPhoneValidateOtpActivity>> verifyPin(@Body isStatic isstatic);
}
