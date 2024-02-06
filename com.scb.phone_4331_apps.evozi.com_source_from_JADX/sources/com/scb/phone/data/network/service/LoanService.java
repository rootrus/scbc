package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.C10857result;
import p040o.ComparisonChain;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableSortedSet;
import p040o.PointFParser;
import p040o.RepeaterParser;
import p040o.ScaleXYParser;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoanService {
    @POST("v1/loans/payment/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<PointFParser>> getPerformLoanPayment(@Body ImmutableSortedSet.Builder builder);

    @POST("v1/loans/summary")
    DebitCardResetOtpActivity<RepeaterParser> getSummary(@Body C10857result result);

    @POST("/v1/loans/payment/verification")
    DebitCardResetOtpActivity<SingleDataEntity<ScaleXYParser>> verifyLoanPayment(@Body ComparisonChain.C31831 r1);
}
