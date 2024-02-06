package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingIterator;
import p040o.JsonDataException;
import p040o.JsonEncodingException;
import p040o.PINMessageException;
import p040o.setCurrentItemInternal;
import p040o.setIndicatorPageChangeListener;
import p040o.standardEquals;
import p040o.standardIndexOf;
import p040o.standardIterator;
import p040o.string;
import p040o.zzvc;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginService {
    @POST("v2/login/changepin")
    DebitCardResetOtpActivity<SingleDataEntity<JsonDataException>> changePin(@Body zzvc zzvc);

    @POST("v1/login/getMigrationFlag")
    DebitCardResetOtpActivity<SingleDataEntity<JsonEncodingException>> getMigrationFLag(@Body standardIterator standarditerator);

    @POST("/v3/login/preloadandresumecheck")
    DebitCardResetOtpActivity<string> getPreloadAndResumeCheck(@Body standardIndexOf standardindexof);

    @POST("v3/login")
    DebitCardResetOtpActivity<Result<SingleDataEntity<PINMessageException>>> login(@Body standardEquals standardequals);

    @POST("v1/login/refresh")
    DebitCardResetOtpActivity<Result<setIndicatorPageChangeListener<SingleDataEntity<PINMessageException>>>> loginFingerPrint(@Body ForwardingIterator forwardingIterator);

    @POST("v2/login/verifypin")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyPin(@Body standardEquals standardequals);
}
