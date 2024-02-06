package com.scb.phone.data.network.service.easycash;

import p040o.DebitCardResetOtpActivity;
import p040o.getNext;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EasycashNcbConsentService {
    @POST("/v1/lending/ncbconsent")
    DebitCardResetOtpActivity<setCurrentItemInternal> postNcbConsent(@Body getNext getnext);
}
