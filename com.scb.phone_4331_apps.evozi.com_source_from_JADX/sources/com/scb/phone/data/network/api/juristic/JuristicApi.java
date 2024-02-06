package com.scb.phone.data.network.api.juristic;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.juristic.JuristicService;
import p040o.AnimatablePathValueParser;
import p040o.AnimatableTextPropertiesParser;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ExplicitOrdering;
import p040o.ForwardingCollection;
import p040o.HmlPinActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.buildRankMap;
import p040o.createAsList;
import p040o.fetchFromCache;
import p040o.fetchFromNetwork;
import p040o.fetchFromNetworkInternal;
import p040o.getErrorFromConnection;
import p040o.onGetStartedClick;
import p040o.parseAnimatableTextProperties;
import p040o.setCurrentItemInternal;
import p040o.standardAddAll;
import p040o.standardClear;
import p040o.zzlx;
import p040o.zzly;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

@HmlSetNTBPinActivity
public final class JuristicApi implements JuristicService {
    private final JuristicService MediaBrowserCompat$CustomActionResultReceiver;

    @POST("v1/juristic/profiles/resetpin/setpin")
    public final BScanCNotificationDeepLinkActivity<setCurrentItemInternal> confirmResetPin(@Body ForwardingCollection forwardingCollection) {
        onGetStartedClick.write((Object) forwardingCollection, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.confirmResetPin(forwardingCollection);
    }

    @GET("/v1/juristic/devices/state/{deviceId}")
    public final DebitCardResetOtpActivity<SingleDataEntity<fetchFromCache>> deviceState(@Path("deviceId") String str) {
        onGetStartedClick.write((Object) str, "deviceId");
        return this.MediaBrowserCompat$CustomActionResultReceiver.deviceState(str);
    }

    @POST("v1/juristic/smeservices/requestform")
    public final DebitCardResetOtpActivity<SingleDataEntity<fetchFromNetwork>> requestForm(@Body zzly zzly) {
        onGetStartedClick.write((Object) zzly, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.requestForm(zzly);
    }

    @POST("/v1/juristic/profiles/resetpin/verifyuser")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchFromNetworkInternal>> resetPin(@Body zzlx.zza zza) {
        onGetStartedClick.write((Object) zza, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.resetPin(zza);
    }

    @POST("/v1/juristic/preregistration/sendota")
    public final DebitCardResetOtpActivity<SingleDataEntity<getErrorFromConnection>> sendOta() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.sendOta();
    }

    @POST("v1/juristic/preregistration/setpin")
    public final DebitCardResetOtpActivity<setCurrentItemInternal> setupJuristicPin(@Body createAsList createaslist) {
        onGetStartedClick.write((Object) createaslist, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.setupJuristicPin(createaslist);
    }

    @POST("/v1/juristic/preregistration/verifybypin")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<parseAnimatableTextProperties>> verifyBusinessPin(@Body buildRankMap buildrankmap) {
        onGetStartedClick.write((Object) buildrankmap, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.verifyBusinessPin(buildrankmap);
    }

    @POST("v1/juristic/preregistration/verifyotp")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<AnimatableTextPropertiesParser>> verifyOtp(@Header("otp") String str, @Header("tokenUUID") String str2, @Body standardClear standardclear) {
        onGetStartedClick.write((Object) standardclear, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.verifyOtp(str, str2, standardclear);
    }

    @POST("v1/juristic/profiles/resetpin/verifybypin")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchFromNetworkInternal>> verifyResetPin(@Body ForwardingCollection forwardingCollection) {
        onGetStartedClick.write((Object) forwardingCollection, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.verifyResetPin(forwardingCollection);
    }

    @POST("v1/juristic/profiles/resetpin/verifyotp")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchFromNetworkInternal>> verifyResetPinOtp(@Header("otp") String str, @Header("tokenUUID") String str2, @Body ExplicitOrdering explicitOrdering) {
        onGetStartedClick.write((Object) explicitOrdering, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.verifyResetPinOtp(str, str2, explicitOrdering);
    }

    @POST("/v1/juristic/preregistration/verifyuser")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<AnimatablePathValueParser>> verifyUser(@Body standardAddAll standardaddall) {
        onGetStartedClick.write((Object) standardaddall, "request");
        return this.MediaBrowserCompat$CustomActionResultReceiver.verifyUser(standardaddall);
    }

    @HmlPinActivity
    public JuristicApi(JuristicService juristicService) {
        onGetStartedClick.write((Object) juristicService, "juristicService");
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicService;
    }
}
