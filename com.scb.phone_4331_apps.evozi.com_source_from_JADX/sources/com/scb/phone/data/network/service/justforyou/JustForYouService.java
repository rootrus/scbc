package com.scb.phone.data.network.service.justforyou;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.getResultFromConnection;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JustForYouService {
    @GET("/v1/justforyou/insights/header")
    DebitCardResetOtpActivity<SingleDataEntity<getResultFromConnection>> insightsHeader(@Query("tilesVersion") String str);
}
