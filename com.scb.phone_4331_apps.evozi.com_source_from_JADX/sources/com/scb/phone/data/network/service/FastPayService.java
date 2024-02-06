package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BaseDeepLinkDelegate;
import p040o.ContentGroup;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLinkEntry;
import p040o.ExceptionParser;
import p040o.ImmutableSortedSet;
import p040o.Interner;
import p040o.getExceptionParser;
import p040o.putInstance;
import p040o.recordLockedRead;
import p040o.unsafeComparator;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface FastPayService {
    @POST("v1/payments/fastpay/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<DeepLinkEntry.Type>> confirmFastPayBillPayment(@Body ImmutableSortedSet.Builder builder);

    @POST("v1/transfer/fastpay/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<ExceptionParser>> confirmFastPayTransfer(@Body unsafeComparator unsafecomparator);

    @GET("v1/profiles/fastpay")
    DebitCardResetOtpActivity<SingleDataEntity<ContentGroup>> getFastPayProfiles();

    @PUT("v1/profiles/fastpay")
    DebitCardResetOtpActivity<SingleDataEntity<ContentGroup>> updateFastPayProfile(@Body recordLockedRead recordlockedread);

    @PUT("v1/profiles/fastpay")
    DebitCardResetOtpActivity<SingleDataEntity<ContentGroup>> updateFastPayProfileWithOtp(@Body recordLockedRead recordlockedread, @Header("tokenUUID") String str, @Header("otp") String str2);

    @POST("v1/payments/fastpay/verification")
    DebitCardResetOtpActivity<SingleDataEntity<BaseDeepLinkDelegate>> verifyFastPayBillPayment(@Body putInstance putinstance);

    @POST("v1/transfer/fastpay/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getExceptionParser>> verifyFastPayTransfer(@Body Interner interner);
}
