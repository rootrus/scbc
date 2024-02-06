package com.scb.phone.data.repository;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.api.ForgotPinApi;
import com.scb.phone.domain.repositories.ForgotPinRepositoryContractor;
import okhttp3.internal.cache.DiskLruCache;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardCoachMarkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FriendsLandingActivity;
import p040o.GoogleMap;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.ICancelToken;
import p040o.IGmsCallbacks;
import p040o.MapView;
import p040o.SafeParcelable;
import p040o.ScriptIntrinsicConvolve5x5;
import p040o.defaultValue;
import p040o.defaultValueUnchecked;
import p040o.getPendingIntent;
import p040o.onCopy;
import p040o.onGetStartedClick;
import p040o.onMarkerClick;
import p040o.setCenterTextOffset;
import p040o.setCurrentItemInternal;
import p040o.standardEquals;
import p040o.zabn;
import p040o.zzuk;
import retrofit2.http.Body;

public class ForgotPinRepository implements ForgotPinRepositoryContractor {
    private final zabn IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final getPendingIntent MediaBrowserCompat$ItemReceiver;
    public final ScriptIntrinsicConvolve5x5 read;
    private final ForgotPinApi write;

    @HmlPinActivity
    public ForgotPinRepository(ForgotPinApi forgotPinApi, getPendingIntent getpendingintent, zabn zabn, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5) {
        this.write = forgotPinApi;
        this.MediaBrowserCompat$ItemReceiver = getpendingintent;
        this.IconCompatParcelizer = zabn;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = scriptIntrinsicConvolve5x5;
    }

    public final DebitCardResetOtpActivity<Boolean> write(String str, String str2) {
        return this.write.IconCompatParcelizer.verifyOtpResetPin(str, str2).flatMap(defaultValue.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<MapView.zzb> IconCompatParcelizer(standardEquals standardequals) {
        return this.write.IconCompatParcelizer.setupNewPin(standardequals).map(new ICancelToken.Stub.zza(this.IconCompatParcelizer)).doOnNext(new SafeParcelable.Indicator(this));
    }

    public DebitCardCoachMarkActivity verifyUser(@Body GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> verifyUser = this.write.verifyUser(onMyLocationButtonClickListener);
        SafeParcelable.Constructor constructor = SafeParcelable.Constructor.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(constructor, "mapper is null");
        return new FriendsLandingActivity(verifyUser, constructor);
    }

    public static /* synthetic */ onMarkerClick MediaBrowserCompat$ItemReceiver(SingleDataEntity singleDataEntity) throws Exception {
        setCenterTextOffset setcentertextoffset = (setCenterTextOffset) singleDataEntity.getData();
        return new onMarkerClick(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setcentertextoffset.read, (Object) DiskLruCache.VERSION_1), onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setcentertextoffset.MediaBrowserCompat$ItemReceiver, (Object) DiskLruCache.VERSION_1));
    }

    public final BScanCNotificationDeepLinkActivity<onMarkerClick> MediaBrowserCompat$CustomActionResultReceiver() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextOffset>> verifyMethod = this.write.IconCompatParcelizer.verifyMethod();
        defaultValueUnchecked defaultvalueunchecked = defaultValueUnchecked.MediaBrowserCompat$CustomActionResultReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(defaultvalueunchecked, "mapper is null");
        return new onCopy(verifyMethod, defaultvalueunchecked);
    }

    public final DebitCardResetOtpActivity<zzuk> write() {
        ForgotPinApi forgotPinApi = this.write;
        return forgotPinApi.IconCompatParcelizer.faceStatus(this.MediaBrowserCompat$CustomActionResultReceiver).map(new IGmsCallbacks(this.MediaBrowserCompat$ItemReceiver));
    }
}
