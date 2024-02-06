package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.JsonUtf8Reader;
import p040o.standardValues;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MediaImageService {
    @POST("v1/media/images")
    DebitCardResetOtpActivity<JsonUtf8Reader> createImage(@Body standardValues standardvalues);
}
