package com.scb.phone.data.network.api.justforyou;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.justforyou.JustForYouService;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.getResultFromConnection;
import p040o.onGetStartedClick;
import retrofit2.http.GET;
import retrofit2.http.Query;

@HmlSetNTBPinActivity
public final class JustForYouApi implements JustForYouService {
    private final JustForYouService MediaBrowserCompat$CustomActionResultReceiver;

    @GET("/v1/justforyou/insights/header")
    public final DebitCardResetOtpActivity<SingleDataEntity<getResultFromConnection>> insightsHeader(@Query("tilesVersion") String str) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        return this.MediaBrowserCompat$CustomActionResultReceiver.insightsHeader(str);
    }

    @HmlPinActivity
    public JustForYouApi(JustForYouService justForYouService) {
        onGetStartedClick.write((Object) justForYouService, "service");
        this.MediaBrowserCompat$CustomActionResultReceiver = justForYouService;
    }
}
