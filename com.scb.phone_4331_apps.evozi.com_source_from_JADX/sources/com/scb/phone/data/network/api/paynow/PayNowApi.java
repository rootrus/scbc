package com.scb.phone.data.network.api.paynow;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.paynow.PayNowService;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.HashBasedTable;
import p040o.HmlPinActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.getAnimationScale;
import p040o.hasZeroScaleAxis;
import p040o.isAtLeastVersion;
import p040o.onGetStartedClick;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

@HmlSetNTBPinActivity
public final class PayNowApi implements PayNowService {
    private final PayNowService IconCompatParcelizer;

    @POST("v1/remittance/promptpay/confirmation")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<isAtLeastVersion>> promptPayConfirmation(@Body HashBasedTable hashBasedTable) {
        onGetStartedClick.write((Object) hashBasedTable, "request");
        return this.IconCompatParcelizer.promptPayConfirmation(hashBasedTable);
    }

    @POST("v1/remittance/promptpay/verification")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<hasZeroScaleAxis>> promptPayVerification(@Body HashBasedTable.Factory factory) {
        onGetStartedClick.write((Object) factory, "request");
        return this.IconCompatParcelizer.promptPayVerification(factory);
    }

    @GET("v1/cta/remittance/promptpay/transactions/id/{deepLinkId}")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<getAnimationScale>> transactions(@Path("deepLinkId") String str) {
        onGetStartedClick.write((Object) str, Name.MARK);
        return this.IconCompatParcelizer.transactions(str);
    }

    @HmlPinActivity
    public PayNowApi(PayNowService payNowService) {
        onGetStartedClick.write((Object) payNowService, "service");
        this.IconCompatParcelizer = payNowService;
    }
}
