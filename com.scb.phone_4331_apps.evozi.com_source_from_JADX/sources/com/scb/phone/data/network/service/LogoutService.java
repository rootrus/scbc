package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.setCurrentItemInternal;
import retrofit2.http.POST;

public interface LogoutService {
    @POST("v1/logout")
    DebitCardResetOtpActivity<setCurrentItemInternal> logout();
}
