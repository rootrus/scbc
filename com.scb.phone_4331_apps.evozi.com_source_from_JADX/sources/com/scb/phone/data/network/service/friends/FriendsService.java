package com.scb.phone.data.network.service.friends;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.getTransformationMatrix;
import retrofit2.http.GET;

public interface FriendsService {
    @GET("/v1/registration/referral/info")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getTransformationMatrix>> getInviteFriendsInfo();
}
