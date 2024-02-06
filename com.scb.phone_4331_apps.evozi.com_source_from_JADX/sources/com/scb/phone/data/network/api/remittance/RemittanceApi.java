package com.scb.phone.data.network.api.remittance;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.remittance.RemittanceService;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.PieRadarChartBase;
import p040o.RadarChart;
import p040o.findSubmapIndex;
import p040o.naturalOrder;
import p040o.onGetStartedClick;
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

@HmlSetNTBPinActivity
public final class RemittanceApi implements RemittanceService {
    private final RemittanceService IconCompatParcelizer;

    @PUT("v1/remittance/termcondversion")
    public final DebitCardResetOtpActivity<setCurrentItemInternal> acceptRemittanceTc() {
        return this.IconCompatParcelizer.acceptRemittanceTc();
    }

    @POST("v2/remittance/confirmation")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<setTransparentCircleColor>> confirmRemittance(@Body naturalOrder naturalorder, @Header("otp") String str, @Header("otpTokenUUID") String str2) {
        onGetStartedClick.write((Object) naturalorder, "request");
        return this.IconCompatParcelizer.confirmRemittance(naturalorder, str, str2);
    }

    @GET("v2/remittance/landing/countryInfo")
    public final DebitCardResetOtpActivity<SingleDataEntity<setTransparentCircleRadius>> countryInfo(@Query("countryName") String str, @Query("channelType") String str2, @Query("agentType") String str3, @Query("currencyCode") String str4, @Query("tilesVersion") String str5) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "channelType");
        onGetStartedClick.write((Object) str3, "agentType");
        onGetStartedClick.write((Object) str4, "currencyCode");
        onGetStartedClick.write((Object) str5, "tilesVersion");
        return this.IconCompatParcelizer.countryInfo(str, str2, str3, str4, str5);
    }

    @GET("v1/remittance/landing")
    public final DebitCardResetOtpActivity<SingleDataEntity<RadarChart>> landing(@Query("countryListRequiredFlag") String str, @Query("tilesVersion") String str2) {
        onGetStartedClick.write((Object) str, "countryListRequiredFlag");
        onGetStartedClick.write((Object) str2, "tilesVersion");
        return this.IconCompatParcelizer.landing(str, str2);
    }

    @POST("v1/remittance/promptpay/accounts/inquiry")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<setMinAngleForSlices>> postRemittanceAccounts(@Body orderedBy orderedby) {
        onGetStartedClick.write((Object) orderedby, "request");
        return this.IconCompatParcelizer.postRemittanceAccounts(orderedby);
    }

    @PUT("v1/remittance/promptpay/accounts")
    public final BScanCNotificationDeepLinkActivity<setCurrentItemInternal> putRemittanceAccounts(@Body findSubmapIndex findsubmapindex) {
        onGetStartedClick.write((Object) findsubmapindex, "request");
        return this.IconCompatParcelizer.putRemittanceAccounts(findsubmapindex);
    }

    @GET("v1/remittance/retry/id/{id}")
    public final DebitCardResetOtpActivity<SingleDataEntity<PieRadarChartBase>> retry(@Path("id") String str) {
        onGetStartedClick.write((Object) str, Name.MARK);
        return this.IconCompatParcelizer.retry(str);
    }

    @GET("v1/remittance/transactions/id/{deeplinkId}")
    public final DebitCardResetOtpActivity<SingleDataEntity<setMinOffset>> transactions(@Path("deeplinkId") String str) {
        onGetStartedClick.write((Object) str, Name.MARK);
        return this.IconCompatParcelizer.transactions(str);
    }

    @POST("v1/remittance/landing/validation")
    public final DebitCardResetOtpActivity<SingleDataEntity<setCurrentItemInternal>> validation(@Body reverseOrder reverseorder) {
        onGetStartedClick.write((Object) reverseorder, "request");
        return this.IconCompatParcelizer.validation(reverseorder);
    }

    @POST("v2/remittance/verification")
    public final DebitCardResetOtpActivity<SingleDataEntity<setRotationEnabled>> verification(@Body validateEntries validateentries) {
        onGetStartedClick.write((Object) validateentries, "request");
        return this.IconCompatParcelizer.verification(validateentries);
    }

    @HmlPinActivity
    public RemittanceApi(RemittanceService remittanceService) {
        onGetStartedClick.write((Object) remittanceService, "service");
        this.IconCompatParcelizer = remittanceService;
    }
}
