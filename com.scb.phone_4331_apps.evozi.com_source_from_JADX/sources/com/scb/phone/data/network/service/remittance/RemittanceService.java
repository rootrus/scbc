package com.scb.phone.data.network.service.remittance;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.PieRadarChartBase;
import p040o.RadarChart;
import p040o.findSubmapIndex;
import p040o.naturalOrder;
import p040o.orderedBy;
import p040o.reverseOrder;
import p040o.setCurrentItemInternal;
import p040o.setMinAngleForSlices;
import p040o.setMinOffset;
import p040o.setRotationEnabled;
import p040o.setTransparentCircleColor;
import p040o.setTransparentCircleRadius;
import p040o.validateEntries;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RemittanceService {
    @PUT("v1/remittance/termcondversion")
    DebitCardResetOtpActivity<setCurrentItemInternal> acceptRemittanceTc();

    @POST("v2/remittance/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setTransparentCircleColor>> confirmRemittance(@Body naturalOrder naturalorder, @Header("otp") String str, @Header("otpTokenUUID") String str2);

    @GET("v2/remittance/landing/countryInfo")
    DebitCardResetOtpActivity<SingleDataEntity<setTransparentCircleRadius>> countryInfo(@Query("countryName") String str, @Query("channelType") String str2, @Query("agentType") String str3, @Query("currencyCode") String str4, @Query("tilesVersion") String str5);

    @GET("v1/remittance/landing")
    DebitCardResetOtpActivity<SingleDataEntity<RadarChart>> landing(@Query("countryListRequiredFlag") String str, @Query("tilesVersion") String str2);

    @POST("v1/remittance/promptpay/accounts/inquiry")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setMinAngleForSlices>> postRemittanceAccounts(@Body orderedBy orderedby);

    @PUT("v1/remittance/promptpay/accounts")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> putRemittanceAccounts(@Body findSubmapIndex findsubmapindex);

    @GET("v1/remittance/retry/id/{id}")
    DebitCardResetOtpActivity<SingleDataEntity<PieRadarChartBase>> retry(@Path("id") String str);

    @GET("v1/remittance/transactions/id/{deeplinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<setMinOffset>> transactions(@Path("deeplinkId") String str);

    @POST("v1/remittance/landing/validation")
    DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> validation(@Body reverseOrder reverseorder);

    @POST("v2/remittance/verification")
    DebitCardResetOtpActivity<SingleDataEntity<setRotationEnabled>> verification(@Body validateEntries validateentries);
}
