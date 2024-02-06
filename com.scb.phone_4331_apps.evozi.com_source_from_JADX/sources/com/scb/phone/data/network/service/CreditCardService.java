package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.Collections2;
import p040o.ComparatorOrdering;
import p040o.DebitCardResetOtpActivity;
import p040o.containsAllImpl;
import p040o.resolveKeyPath;
import p040o.setAnimationFromJson;
import p040o.setAnimationFromUrl;
import p040o.setComposition;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CreditCardService {
    @POST("v2/creditcards/summary")
    DebitCardResetOtpActivity<setAnimationFromJson> getCreditCard(@Body ComparatorOrdering comparatorOrdering);

    @POST("v1/creditcards/statements")
    DebitCardResetOtpActivity<setAnimationFromUrl> getCreditCardStatement(@Body Collections2.TransformedCollection transformedCollection);

    @POST("v2/creditcards/rewards")
    DebitCardResetOtpActivity<SingleDataEntity<resolveKeyPath>> getRewards(@Body containsAllImpl containsallimpl);

    @POST("v1/creditcards/transactions/unbilled")
    DebitCardResetOtpActivity<setComposition> getUnbilled(@Body Collections2.FilteredCollection filteredCollection);
}
