package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.logRenderTimes;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface EligibilityService {
    @GET
    DebitCardResetOtpActivity<SingleDataEntity<logRenderTimes>> getEligibilityDetails(@Url String str);
}
