package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.Map;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.clamp;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

public interface PartnerAuthorizeService {
    @GET("partners/v2/oauth/authorize")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<clamp>> getPartnerAuthorize(@Header("applicationId") String str, @Header("response-channel") String str2, @Header("endState") String str3, @QueryMap Map<String, String> map);
}
