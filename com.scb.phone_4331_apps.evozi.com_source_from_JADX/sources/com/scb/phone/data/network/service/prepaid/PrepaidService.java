package com.scb.phone.data.network.service.prepaid;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableBiMap;
import p040o.ImmutableCollection;
import p040o.ImmutableEntry;
import p040o.LottieFrameInfo;
import p040o.copyOf;
import p040o.resizeBitmapIfNeeded;
import p040o.resolveKeyPath;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface PrepaidService {
    @POST("/v1/prepaidcards/summary")
    DebitCardResetOtpActivity<SingleDataEntity<resizeBitmapIfNeeded>> getPrePaidCardSummary(@Body copyOf copyof);

    @POST("/v1/prepaidcards/resetpin")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> getPrepaidResetOtpConfirm(@Body ImmutableEntry immutableEntry, @Header("otpTokenUUID") String str, @Header("otp") String str2);

    @POST("/v2/prepaidcards/transactions")
    DebitCardResetOtpActivity<SingleDataEntity<LottieFrameInfo>> getPrepaidTransactions(@Body ImmutableCollection.C34981 r1);

    @POST("/v1/prepaidcards/rewards")
    DebitCardResetOtpActivity<SingleDataEntity<resolveKeyPath>> getReward(@Body ImmutableBiMap.Builder builder);
}
