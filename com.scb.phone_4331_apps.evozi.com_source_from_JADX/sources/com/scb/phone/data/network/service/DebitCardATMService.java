package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieCompositionParser;
import p040o.LottieFrameInfo;
import p040o.isInlineCleanup;
import p040o.isLive;
import p040o.isUnset;
import p040o.newEntry;
import p040o.reclaimValue;
import p040o.setCurrentItemInternal;
import p040o.setMaxFrame;
import p040o.setMinAndMaxProgress;
import p040o.setMinFrame;
import p040o.setMinProgress;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface DebitCardATMService {
    @PUT("v1/debitcards/blockstatus")
    DebitCardResetOtpActivity<SingleDataEntity<setMaxFrame>> debitCardBlockStatus(@Body isUnset isunset);

    @GET("v1/debitcards/limits")
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionParser>> debitCardLimit();

    @GET("v1/debitcards/resetpin")
    DebitCardResetOtpActivity<SingleDataEntity<setMinFrame>> debitCardResetPin(@Header("cardRefNo") String str);

    @POST("v1/debitcards/rewards")
    DebitCardResetOtpActivity<SingleDataEntity<setMinProgress>> debitCardReward(@Body isInlineCleanup isinlinecleanup);

    @POST("v1/debitcards/transactions")
    DebitCardResetOtpActivity<SingleDataEntity<LottieFrameInfo>> debitCardTransaction(@Body reclaimValue reclaimvalue);

    @POST("v2/debitcards/summary")
    DebitCardResetOtpActivity<SingleDataEntity<setMinAndMaxProgress>> debitCardsSummary(@Body isLive islive);

    @PUT("v1/debitcards/limits")
    DebitCardResetOtpActivity<setCurrentItemInternal> putDebitCardLimit(@Header("tokenUUID") String str, @Header("otp") String str2, @Body newEntry newentry);
}
