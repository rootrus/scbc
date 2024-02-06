package p040o;

import java.util.ArrayList;

/* renamed from: o.FeaturesSettingsData */
public final /* synthetic */ class FeaturesSettingsData implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DefaultSettingsSpiCall IconCompatParcelizer;

    public /* synthetic */ FeaturesSettingsData(DefaultSettingsSpiCall defaultSettingsSpiCall) {
        this.IconCompatParcelizer = defaultSettingsSpiCall;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultSettingsSpiCall defaultSettingsSpiCall = this.IconCompatParcelizer;
        Throwable th = (Throwable) obj;
        boolean z = true;
        if (defaultSettingsSpiCall.RatingCompat != null) {
            defaultSettingsSpiCall.RatingCompat.aj_();
        }
        ListenableFutureTask listenableFutureTask = new ListenableFutureTask(CrashlyticsReportJsonTransform$$Lambda$8.PROVINCE, defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_province_hint), defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_province_header), new ArrayList(), (String) null);
        if (defaultSettingsSpiCall.MediaBrowserCompat$SearchResultReceiver(th)) {
            SettingsRequest settingsRequest = new SettingsRequest(listenableFutureTask, th);
            if (defaultSettingsSpiCall.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settingsRequest.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
                return;
            }
            return;
        }
        getExpiresAtMillis getexpiresatmillis = new getExpiresAtMillis(listenableFutureTask);
        if (defaultSettingsSpiCall.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getexpiresatmillis.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
        }
    }
}
