package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.apply;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface FindUsService {
    @GET("v2/findus/geomarker")
    DebitCardResetOtpActivity<apply> getGeomarkers(@Header("latitude") double d, @Header("longitude") double d2, @Header("user-gps-enabled") int i, @Header("location-type") String str);

    @GET("v2/findus/geomarker")
    DebitCardResetOtpActivity<apply> getGeomarkers(@Header("latitude") double d, @Header("longitude") double d2, @Header("user-gps-enabled") int i, @Header("location-type") String str, @Header("user-latitude") double d3, @Header("user-longitude") double d4);
}
