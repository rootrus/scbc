package com.scb.phone.data.network.service.search;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ImmutableSortedMap;
import p040o.setMaxLine;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SequentialSearchService {
    @POST("/v1/lending/service/car/inquiry")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setMaxLine>> postCarInquiry(@Body ImmutableSortedMap.ValuesSerializedForm valuesSerializedForm);
}
