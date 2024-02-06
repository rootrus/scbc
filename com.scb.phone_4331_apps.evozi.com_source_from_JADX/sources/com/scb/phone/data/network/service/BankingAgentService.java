package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C1251R;
import p040o.ComparisonChain;
import p040o.ComputingConcurrentHashMap;
import p040o.OnTextChanged;
import p040o.OnTouch;
import p040o.Optional;
import p040o.classify;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface BankingAgentService {
    @PUT("/v1/bankingagent/termcondversion")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> acceptTc(@Body classify classify);

    @POST("v1/bankingagent/qrbarcode/generate")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<C1251R.attr>> generateQRBarcode(@Body ComputingConcurrentHashMap computingConcurrentHashMap);

    @GET("v2/bankingagent/agents")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<OnTouch>> getAgents(@Query("postingType") String str);

    @GET("v1/bankingagent/tcversion")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<OnTextChanged.Callback>> getTcVersion();

    @POST("/v1/bankingagent/validation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<Optional>> validateBankingAgent(@Body ComparisonChain comparisonChain);
}
