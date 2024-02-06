package com.scb.phone.data.network.service;

import p040o.C10857result;
import p040o.DebitCardResetOtpActivity;
import p040o.ShapeStrokeParser;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SmeLoanService {
    @POST("v1/loans/summary/sme")
    DebitCardResetOtpActivity<ShapeStrokeParser> getSmeLoanSummary(@Body C10857result result);
}
