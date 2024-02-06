package com.scb.phone.data.network.service.common;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.removeAnimatorListener;
import p040o.removeLottieOnCompositionLoadedListener;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface SlipPlatformService {
    @GET("v1/slip/renderslip/{refId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<removeLottieOnCompositionLoadedListener>> getThirdPartySlip(@Path("refId") String str);

    @POST("v1/slip/generate")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<removeLottieOnCompositionLoadedListener>> postThirdPartySlipGenerate(@Body removeAnimatorListener removeanimatorlistener);
}
