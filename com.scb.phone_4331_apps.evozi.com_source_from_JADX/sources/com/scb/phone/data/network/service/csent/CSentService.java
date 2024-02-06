package com.scb.phone.data.network.service.csent;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.isCollected;
import p040o.setApplyingOpacityToLayersEnabled;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CSentService {
    @POST("v1/privacy/consent/inquiry")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<List<setApplyingOpacityToLayersEnabled>>> postPrivacyConsentInquiry(@Body isCollected iscollected);

    @PUT("v2/privacy/consent")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<List<HmlVerifyPhoneValidateOtpActivity>>> updatePrivacyConsent(@Body isCollected iscollected);
}
