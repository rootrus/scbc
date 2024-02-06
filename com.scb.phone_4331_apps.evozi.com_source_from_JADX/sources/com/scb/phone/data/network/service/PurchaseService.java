package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableMultiset;
import p040o.ImmutableSet;
import p040o.chooseTableSize;
import p040o.setNoDataText;
import p040o.setOnChartValueSelectedListener;
import p040o.setOnTouchListener;
import p040o.setPaint;
import p040o.setRenderer;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PurchaseService {
    @POST("v1/purchases/cards/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<setOnChartValueSelectedListener>> confirmPurchase(@Body ImmutableSet.SerializedForm serializedForm);

    @POST("v1/purchases/payment/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setOnTouchListener>> purchasePaymentConfirmation(@Body ImmutableSet.ArrayImmutableSet arrayImmutableSet);

    @GET("v1/purchases/payment/id/{deepLinkId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setRenderer>> purchasesPaymentId(@Path("deepLinkId") String str);

    @POST("v1/purchases/payment/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setPaint>> verifyPurchase(@Body ImmutableMultiset.EntrySet.C35041 r1);

    @POST("v1/purchases/cards/verification")
    DebitCardResetOtpActivity<SingleDataEntity<setNoDataText>> verifyPurchase(@Body chooseTableSize choosetablesize);
}
