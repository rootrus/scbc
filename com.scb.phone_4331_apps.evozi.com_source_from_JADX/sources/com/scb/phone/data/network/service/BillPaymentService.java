package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BaseDeepLinkDelegate;
import p040o.C1251R;
import p040o.C1600value;
import p040o.C5431transform;
import p040o.Collections2;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLink;
import p040o.DeepLinkEntry;
import p040o.ImmutableSortedSet;
import p040o.ImmutableSortedSetFauxverideShim;
import p040o.Interners;
import p040o.ViewCollections;
import p040o.defaultPort;
import p040o.getChecked;
import p040o.newStrongInterner;
import p040o.putInstance;
import p040o.withExplicitOrder;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface BillPaymentService {
    @POST("v1/payments/bill/autoinquiry")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.C1252drawable>> getAutoInquiryAmount(@Body Collections2 collections2);

    @POST("v1/donations/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<DeepLinkEntry.Type>> getBillPaymentEDonationConfirmation(@Body ImmutableSortedSet.SerializedForm serializedForm);

    @POST("v1/donations/verification")
    DebitCardResetOtpActivity<SingleDataEntity<BaseDeepLinkDelegate>> getBillPaymentEDonationReview(@Body ImmutableSortedSetFauxverideShim immutableSortedSetFauxverideShim);

    @GET("v1/payments/history")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.styleable>> getBillPaymentHistory(@Query("pagingOffset") Integer num);

    @POST("v1/payments/bill/review")
    DebitCardResetOtpActivity<SingleDataEntity<BaseDeepLinkDelegate>> getBillPaymentReview(@Body putInstance putinstance);

    @POST("v7/payments/bill/scan")
    DebitCardResetOtpActivity<SingleDataEntity<DeepLink>> getBillScan(@Body newStrongInterner newstronginterner);

    @GET("/v1/payments/billers")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.color>> getBillerByAccountNumber(@Query("accountNo") String str, @Query("scanToken") String str2);

    @GET("/v1/payments/billers")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.color>> getBillerByCompCode(@Query("compCode") String str);

    @POST("v1/deals/verification")
    DebitCardResetOtpActivity<SingleDataEntity<BaseDeepLinkDelegate>> getDealReview(@Body withExplicitOrder withexplicitorder);

    @GET("v1/payments/ebills/statement")
    DebitCardResetOtpActivity<C1600value> getEBills();

    @GET("v2/payments/ebills/statement")
    DebitCardResetOtpActivity<SingleDataEntity<C1600value>> getEBills(@Query("pageNumber") int i);

    @POST("v1/payments/bill/sf")
    DebitCardResetOtpActivity<SingleDataEntity<DeepLinkEntry.Type>> getPerformCinemaPayment(@Body ImmutableSortedSet.Builder builder);

    @POST("v1/payments/bill")
    DebitCardResetOtpActivity<SingleDataEntity<DeepLinkEntry.Type>> getPerformPayment(@Body ImmutableSortedSet.Builder builder);

    @POST("v1/payments/bill")
    @Headers({"Referer: lifestyle"})
    DebitCardResetOtpActivity<SingleDataEntity<DeepLinkEntry.Type>> getPerformPaymentWithReferer(@Body ImmutableSortedSet.Builder builder);

    @GET("/v1/payments/billers/info/recommend")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.dimen>> getRecommandedBiller();

    @POST("v1/payments/repeat")
    DebitCardResetOtpActivity<SingleDataEntity<ViewCollections>> getRepeat(@Body Interners.WeakInterner.InternReference internReference);

    @POST("v1/rtp/billpay/confirm")
    DebitCardResetOtpActivity<SingleDataEntity<defaultPort>> getRtpEBillPaymentConfirm(@Body ImmutableSortedSet.Builder builder);

    @POST("v1/rtp/billpay/review")
    DebitCardResetOtpActivity<SingleDataEntity<getChecked>> getRtpEBillPaymentReview(@Body Interners interners);

    @GET("/v1/payments/billers/subscription/info/recommend")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.dimen>> getRtpSubscriptionRecommandedBiller();

    @POST("/v1/payments/billers/subscription/info")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.C1253id>> getRtpSubscriptionSearchBillerList(@Body C5431transform transform);

    @POST("/v1/payments/billers/info")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<C1251R.C1253id>> getSearchBillPaymentList(@Body C5431transform transform);

    @POST("/v1/payments/billers/info")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.C1253id>> getSearchBillerList(@Body C5431transform transform);
}
