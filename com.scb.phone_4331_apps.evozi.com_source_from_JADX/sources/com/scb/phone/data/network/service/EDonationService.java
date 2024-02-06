package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface EDonationService {
    @GET("/v1/donations/document")
    DebitCardResetOtpActivity<String> getDonationDocument(@Header("tilesVersion") String str);
}
