package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.addWarning;
import p040o.rowMap;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CustomerService {
    @POST("v1/customer/ntb/introductions")
    DebitCardResetOtpActivity<SingleDataEntity<addWarning>> getIntroductions();

    @POST("v1/customer/ntb/profiles")
    DebitCardResetOtpActivity<Result<SingleDataEntity<addWarning>>> postUserProfile(@Body rowMap rowmap);
}
