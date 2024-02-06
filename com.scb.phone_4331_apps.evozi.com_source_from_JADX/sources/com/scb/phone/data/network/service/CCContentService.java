package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.getIsAdIdFakeForDebugLogging;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface CCContentService {
    @GET
    DebitCardResetOtpActivity<getIsAdIdFakeForDebugLogging> getCMContent(@Url String str);
}
