package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.getKey;
import p040o.last;
import p040o.nextNode;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface NotificationsService {
    @GET("v2/notifications/preferences")
    DebitCardResetOtpActivity<SingleDataEntity<last>> getNotificationPreferences();

    @GET("v1/notifications/unread-count")
    DebitCardResetOtpActivity<SingleDataEntity<nextNode>> getNotificationUnreadCount();

    @GET("v1/notifications")
    DebitCardResetOtpActivity<SingleDataEntity<getKey>> getNotifications();

    @GET("v1/notifications")
    DebitCardResetOtpActivity<SingleDataEntity<getKey>> getNotifications(@Query("lastMessageId") String str);

    @PUT("v1/notifications/preferences")
    DebitCardResetOtpActivity<SingleDataEntity<Void>> updateNotificationPreferences(@Body last last);
}
