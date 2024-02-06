package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.Collections2;
import p040o.DebitCardResetOtpActivity;
import p040o.getInnerRadius;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface InvestmentService {
    @POST("v1/investments/summary")
    DebitCardResetOtpActivity<SingleDataEntity<getInnerRadius>> getInvestmentSummary(@Body Collections2.FilteredCollection.C31791 r1);
}
