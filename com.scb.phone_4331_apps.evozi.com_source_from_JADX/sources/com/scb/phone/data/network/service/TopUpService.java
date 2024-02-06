package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.AdvertisingIdClient;
import p040o.CampaignTrackingService;
import p040o.DebitCardResetOtpActivity;
import p040o.Interners;
import p040o.checkNonnegativeIndex;
import p040o.consumingIterable;
import p040o.disconnect;
import p040o.getFloat;
import p040o.isLimitAdTrackingEnabled;
import p040o.setShouldSkipGmsCoreVersionCheck;
import p040o.zza;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TopUpService {
    @POST("v2/topup/billers/{billerId}/additionalinfo")
    DebitCardResetOtpActivity<SingleDataEntity<zza>> getAdditionalInfo(@Path("billerId") int i, @Body consumingIterable consumingiterable);

    @GET("v1/topup/billers/{billerId}/denominations")
    DebitCardResetOtpActivity<SingleDataEntity<setShouldSkipGmsCoreVersionCheck>> getBillerDenomination(@Path("billerId") String str);

    @GET("v1/topup/billers/{billerId}/range")
    DebitCardResetOtpActivity<SingleDataEntity<AdvertisingIdClient.zza>> getBillerRange(@Path("billerId") String str);

    @GET("v1/topup/billers")
    DebitCardResetOtpActivity<disconnect> getBillers();

    @GET("v1/topup/history")
    DebitCardResetOtpActivity<SingleDataEntity<getFloat>> getHistory(@Query("pagingOffset") Integer num);

    @POST("v1/topup/quickTopup")
    DebitCardResetOtpActivity<SingleDataEntity<isLimitAdTrackingEnabled>> getPerformQuickTopUp(@Body checkNonnegativeIndex checknonnegativeindex);

    @POST("v2/topup")
    DebitCardResetOtpActivity<SingleDataEntity<isLimitAdTrackingEnabled>> getPerformTopUp(@Body checkNonnegativeIndex checknonnegativeindex);

    @POST("v2/topup")
    @Headers({"Referer: lifestyle"})
    DebitCardResetOtpActivity<SingleDataEntity<isLimitAdTrackingEnabled>> getPerformTopUpWithReferer(@Body checkNonnegativeIndex checknonnegativeindex);

    @POST("v1/topup/repeat")
    DebitCardResetOtpActivity<SingleDataEntity<CampaignTrackingService>> getRepeat(@Body Interners.WeakInterner.InternReference internReference);
}
