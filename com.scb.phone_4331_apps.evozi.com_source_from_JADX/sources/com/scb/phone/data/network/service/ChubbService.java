package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableSortedSet;
import p040o.flushLocations;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ChubbService {
    @POST("v1/payments/bill")
    DebitCardResetOtpActivity<SingleDataEntity<flushLocations>> chubbConfirm(@Body ImmutableSortedSet.Builder builder);
}
