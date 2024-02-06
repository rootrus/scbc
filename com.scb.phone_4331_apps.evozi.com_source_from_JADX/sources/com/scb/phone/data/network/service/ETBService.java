package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.BaseStrokeContent;
import p040o.DebitCardResetOtpActivity;
import p040o.LPaint;
import p040o.SimpleColorFilter;
import p040o.applyTrimPath;
import p040o.invalidateAllText;
import p040o.logRenderTimes;
import p040o.onValueChanged;
import p040o.postReadCleanup;
import p040o.postWriteCleanup;
import p040o.recordRead;
import p040o.recordWrite;
import p040o.removeFromChain;
import p040o.rowKeySet;
import p040o.runCleanup;
import p040o.setCacheText;
import p040o.setCurrentItemInternal;
import p040o.setText;
import p040o.setTextLocales;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ETBService {
    @POST("v2/deposits/openaccounts/validations/eligibility")
    DebitCardResetOtpActivity<setCurrentItemInternal> eligibilityOpenAccountValidation(@Body postReadCleanup postreadcleanup);

    @POST("v1/deposits/openaccounts/validations/eligibility")
    DebitCardResetOtpActivity<setCurrentItemInternal> eligibilityValidation();

    @GET("v1/deposits/products/detail")
    DebitCardResetOtpActivity<SingleDataEntity<setCacheText>> getDepositProduct(@Query("productCode") String str, @Query("openflag") String str2);

    @GET("v2/deposits/openaccounts/products/info")
    DebitCardResetOtpActivity<SingleDataEntity<setText>> getETBCProductInfo(@Query("openFlag") String str);

    @GET("v1/deposits/openaccounts/eligibility")
    DebitCardResetOtpActivity<SingleDataEntity<logRenderTimes>> getETBCheckEligibility();

    @GET("v1/deposits/openaccounts/products/detail/{accountType}")
    DebitCardResetOtpActivity<SingleDataEntity<invalidateAllText>> getOpenAccountProductDetail(@Path("accountType") String str, @Query("productCode") String str2, @Query("openFlag") String str3, @Query("tilesVersion") String str4);

    @GET("v1/deposits/openaccounts/marketconduct")
    DebitCardResetOtpActivity<SingleDataEntity<LPaint>> getPdfUrl();

    @GET("v1/deposits/products/{productCode}/termsandcondition")
    DebitCardResetOtpActivity<SingleDataEntity<applyTrimPath>> getProductTermAndCondition(@Path("productCode") String str, @Query("openflag") String str2);

    @GET("v1/deposits/openaccounts/profile")
    DebitCardResetOtpActivity<SingleDataEntity<onValueChanged>> getProfile();

    @GET("v1/deposits/openaccounts/objectives")
    DebitCardResetOtpActivity<SingleDataEntity<List<BaseStrokeContent>>> getPurpose();

    @POST("v1/deposits/openaccounts/product")
    DebitCardResetOtpActivity<setCurrentItemInternal> performSelectProduct(@Body removeFromChain removefromchain);

    @POST("v1/deposits/openaccounts/validations/casa")
    DebitCardResetOtpActivity<setCurrentItemInternal> selectAccountValidation(@Body recordRead recordread);

    @POST("v1/deposits/openaccounts/fatca")
    DebitCardResetOtpActivity<setCurrentItemInternal> submitFatca(@Body rowKeySet rowkeyset);

    @POST("v1/deposits/openaccounts/validations/profile")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyIdentity(@Body recordWrite recordwrite);

    @POST("v2/deposits/openaccounts/verification")
    DebitCardResetOtpActivity<SingleDataEntity<SimpleColorFilter>> verifyOpenAccount(@Body runCleanup runcleanup);

    @POST("v2/deposits/openaccounts/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<setTextLocales>> verifyOtp(@Header("tokenUUID") String str, @Header("otp") String str2, @Body postWriteCleanup postwritecleanup);
}
