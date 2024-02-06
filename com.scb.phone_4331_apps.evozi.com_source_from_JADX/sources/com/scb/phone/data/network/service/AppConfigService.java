package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.OnCheckedChanged;
import p040o.OnItemLongClick;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AppConfigService {
    @POST("v1/config/frontend")
    DebitCardResetOtpActivity<OnCheckedChanged> getAppConfig(@Body OnItemLongClick onItemLongClick);
}
