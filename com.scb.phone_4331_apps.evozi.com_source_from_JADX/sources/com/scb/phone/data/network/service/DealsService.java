package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.safeContains;
import p040o.setImageAssetDelegate;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DealsService {
    @POST("/v1/deals/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<setImageAssetDelegate>> confirmDealsBuy(@Body safeContains safecontains);
}
