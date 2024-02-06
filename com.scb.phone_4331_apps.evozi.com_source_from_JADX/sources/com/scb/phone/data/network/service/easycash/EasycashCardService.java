package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.LottieCompositionFactory;
import p040o.expireEntries;
import p040o.newEntryArray;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EasycashCardService {
    @POST("/v1/lending/request-info/card/detail/data-initiation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieCompositionFactory.C36075>> cardInfoInit(@Body newEntryArray newentryarray);

    @POST("/v1/lending/request-info/card/detail")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postCardInfo(@Body expireEntries expireentries);
}
