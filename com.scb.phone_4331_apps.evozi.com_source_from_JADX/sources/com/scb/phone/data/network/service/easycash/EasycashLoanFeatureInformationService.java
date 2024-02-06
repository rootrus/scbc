package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.LottieLogger;
import p040o.getFirst;
import p040o.getLiveValue;
import p040o.newEntryArray;
import p040o.setCurrentItemInternal;
import p040o.warning;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EasycashLoanFeatureInformationService {
    @POST("/v1/lending/request-info/speedyloan/detail/calculation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<warning>> loanCalculation(@Body getFirst getfirst);

    @POST("/v1/lending/request-info/speedyloan/detail/data-initiation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieLogger>> loanInfoInit(@Body newEntryArray newentryarray);

    @POST("/v1/lending/request-info/speedyloan/detail")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postLoanInfo(@Body getLiveValue getlivevalue);
}
