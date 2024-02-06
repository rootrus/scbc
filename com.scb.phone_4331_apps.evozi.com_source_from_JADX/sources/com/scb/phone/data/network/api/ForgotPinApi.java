package com.scb.phone.data.network.api;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.ForgotPinService;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;

public class ForgotPinApi {
    public final ForgotPinService IconCompatParcelizer;

    @HmlPinActivity
    public ForgotPinApi(ForgotPinService forgotPinService) {
        this.IconCompatParcelizer = forgotPinService;
    }

    public BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> verifyUser(@Body GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        return this.IconCompatParcelizer.verifyUser(onMyLocationButtonClickListener);
    }
}
