package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.BaseLottieAnimator;
import p040o.C9877cache;
import p040o.DebitCardResetOtpActivity;
import p040o.LinkedHashTreeMap;
import p040o.LogcatLogger;
import p040o.LottieValueAnimator;
import p040o.OECF_sRGB;
import p040o.concurrencyLevel;
import p040o.containsRow;
import p040o.removeAllListeners;
import p040o.row;
import p040o.setCurrentItemInternal;
import p040o.setInstance;
import p040o.setStartDelay;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EkycService {
    @POST("v1/ekyc/identity/validation")
    DebitCardResetOtpActivity<setCurrentItemInternal> completeSubmission();

    @POST("v1/ekyc/registrations")
    DebitCardResetOtpActivity<Result<SingleDataEntity<removeAllListeners>>> confirmRegistration(@Header("tokenUUID") String str, @Header("otp") String str2);

    @GET("v1/deposits/products/detail")
    DebitCardResetOtpActivity<SingleDataEntity<LinkedHashTreeMap.Node>> getDepositProductDetail(@Query("productCode") String str);

    @GET("v1/deposits/products/info")
    DebitCardResetOtpActivity<SingleDataEntity<BaseLottieAnimator>> getDepositProductList(@Query("openFlag") String str);

    @GET("v3/ekyc/registrations")
    DebitCardResetOtpActivity<Result<SingleDataEntity<OECF_sRGB>>> getEkycRegistration();

    @GET("v1/deposits/fatca")
    DebitCardResetOtpActivity<SingleDataEntity<C9877cache>> getFatca();

    @GET("/v1/deposits/openaccounts/objectives")
    DebitCardResetOtpActivity<SingleDataEntity<List<LogcatLogger>>> getObjectives();

    @GET("v1/customer/jobs")
    DebitCardResetOtpActivity<SingleDataEntity<setInstance>> getOccupationList();

    @GET("v1/staticcontents/termsandconditions/deposits/openaccounts/{productCode}/latest/html")
    DebitCardResetOtpActivity<SingleDataEntity<LottieValueAnimator>> getProductTermCondition(@Path("productCode") String str);

    @GET("v1/customer/individuals/titles")
    DebitCardResetOtpActivity<SingleDataEntity<setStartDelay>> getTitleList(@Query("source") String str);

    @POST("v1/ekyc/registrations/initiate")
    DebitCardResetOtpActivity<SingleDataEntity<OECF_sRGB>> initiateEkycRegistration(@Body row row);

    @PUT("v1/ekyc/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<OECF_sRGB>> submitConsent(@Body containsRow containsrow);

    @PUT("v1/ekyc/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<OECF_sRGB>> submitFatca(@Body containsRow containsrow);

    @PUT("v1/ekyc/registrations")
    DebitCardResetOtpActivity<SingleDataEntity<OECF_sRGB>> submitRegistration(@Body containsRow containsrow);

    @POST("v1/ekyc/photos")
    DebitCardResetOtpActivity<setCurrentItemInternal> uploadNationalId(@Body concurrencyLevel concurrencylevel);
}
