package com.scb.phone.data.network.service;

import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieCompositionFactory;
import p040o.fromJsonInputStreamSync;
import p040o.readMapMaker;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PUT;

public interface DeviceService {
    @HTTP(hasBody = true, method = "DELETE", path = "v1/profiles/devices")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteDevice(@Body readMapMaker readmapmaker);

    @GET("v2/profiles/devices")
    DebitCardResetOtpActivity<LottieCompositionFactory> getDevices();

    @PUT("v1/profiles/devices")
    DebitCardResetOtpActivity<fromJsonInputStreamSync> updateDevice(@Body CustomConcurrentHashMap.EntryFactory entryFactory);
}
