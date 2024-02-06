package com.scb.phone.data.network.service.paynow;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.HashBasedTable;
import p040o.getAnimationScale;
import p040o.hasZeroScaleAxis;
import p040o.isAtLeastVersion;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PayNowService {
    @POST("v1/remittance/promptpay/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<isAtLeastVersion>> promptPayConfirmation(@Body HashBasedTable hashBasedTable);

    @POST("v1/remittance/promptpay/verification")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<hasZeroScaleAxis>> promptPayVerification(@Body HashBasedTable.Factory factory);

    @GET("v1/cta/remittance/promptpay/transactions/id/{deepLinkId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getAnimationScale>> transactions(@Path("deepLinkId") String str);
}
