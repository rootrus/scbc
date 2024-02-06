package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.ExceptionParser;
import p040o.ExceptionReporter;
import p040o.ImmutableSortedMapFauxverideShim;
import p040o.Interner;
import p040o.Interners;
import p040o.Iterables;
import p040o.getDescription;
import p040o.getExceptionParser;
import p040o.immutableSortedUniqueCopy;
import p040o.onReceive;
import p040o.setPageMargin;
import p040o.zzah;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface TransferService {
    @POST("v3/transfer/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<ExceptionParser>> confirm(@Body immutableSortedUniqueCopy immutablesorteduniquecopy);

    @POST("v3/transfer/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<ExceptionParser>> confirm(@Body immutableSortedUniqueCopy immutablesorteduniquecopy, @Header("otp") String str, @Header("tokenUUID") String str2);

    @POST("v1/transfer/fixed/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<ExceptionParser>> confirmFixedAccount(@Body Interners.C35151 r1, @Header("otp") String str, @Header("tokenUUID") String str2);

    @GET("v2/transfer/banks")
    DebitCardResetOtpActivity<setPageMargin<onReceive>> getBanks();

    @GET("v1/transfer/eligiblebanks")
    DebitCardResetOtpActivity<setPageMargin<onReceive>> getEligibleBanks();

    @GET("v1/transfer/history")
    DebitCardResetOtpActivity<SingleDataEntity<ExceptionReporter>> getTransferHistory(@Query("pagingOffset") Integer num);

    @POST("v1/transfer/repeat")
    DebitCardResetOtpActivity<SingleDataEntity<getDescription>> repeatTransfer(@Body Iterables iterables);

    @POST("v2/transfer/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getExceptionParser>> verify(@Body ImmutableSortedMapFauxverideShim immutableSortedMapFauxverideShim);

    @POST("v2/transfer/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getExceptionParser>> verify(@Body Interner interner);

    @POST("v1/transfer/fixed/verification")
    DebitCardResetOtpActivity<SingleDataEntity<zzah>> verify(@Body Interners.WeakInterner.C97691 r1);
}
