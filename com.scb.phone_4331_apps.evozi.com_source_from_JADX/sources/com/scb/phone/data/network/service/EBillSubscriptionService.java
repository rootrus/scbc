package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.addFrameListener;
import p040o.done;
import p040o.processPendingCleanup;
import p040o.recordExpirationTime;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface EBillSubscriptionService {
    @POST("v1/payments/ebills/subscription")
    DebitCardResetOtpActivity<SingleDataEntity<done>> getConfirmRequest(@Body processPendingCleanup processpendingcleanup);

    @GET("v1/payments/ebills/subscription")
    DebitCardResetOtpActivity<SingleDataEntity<addFrameListener>> getEBillSubscription(@Query("pageNumber") int i);

    @PUT("v1/payments/ebills/unsubscription")
    DebitCardResetOtpActivity<setCurrentItemInternal> getUnsubcribeRequest(@Body recordExpirationTime recordexpirationtime);
}
