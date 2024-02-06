package p040o;

import java.util.List;
import p040o.DefaultSettingsSpiCall;
import p040o.DiscoverFundPerformanceActivity;

/* renamed from: o.SettingsV3JsonTransform */
public final /* synthetic */ class SettingsV3JsonTransform implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ addDelayedShutdownHook IconCompatParcelizer;
    private final /* synthetic */ DefaultSettingsSpiCall MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CrashlyticsReportJsonTransform$$Lambda$8 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ SettingsV3JsonTransform(DefaultSettingsSpiCall defaultSettingsSpiCall, CrashlyticsReportJsonTransform$$Lambda$8 crashlyticsReportJsonTransform$$Lambda$8, addDelayedShutdownHook adddelayedshutdownhook) {
        this.MediaBrowserCompat$CustomActionResultReceiver = defaultSettingsSpiCall;
        this.MediaBrowserCompat$ItemReceiver = crashlyticsReportJsonTransform$$Lambda$8;
        this.IconCompatParcelizer = adddelayedshutdownhook;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultSettingsSpiCall defaultSettingsSpiCall = this.MediaBrowserCompat$CustomActionResultReceiver;
        CrashlyticsReportJsonTransform$$Lambda$8 crashlyticsReportJsonTransform$$Lambda$8 = this.MediaBrowserCompat$ItemReceiver;
        addDelayedShutdownHook adddelayedshutdownhook = this.IconCompatParcelizer;
        DiscoverFundPerformanceActivity.read read = (DiscoverFundPerformanceActivity.read) obj;
        boolean z = false;
        if (defaultSettingsSpiCall.RatingCompat != null) {
            defaultSettingsSpiCall.RatingCompat.aj_();
        }
        List<addDelayedShutdownHook> write = defaultSettingsSpiCall.IconCompatParcelizer.write(read);
        if (write.size() == 1 && crashlyticsReportJsonTransform$$Lambda$8 == CrashlyticsReportJsonTransform$$Lambda$8.SUB_DISTRICT) {
            SessionSettingsData sessionSettingsData = new SessionSettingsData(write);
            if (defaultSettingsSpiCall.RatingCompat != null) {
                z = true;
            }
            if (z) {
                sessionSettingsData.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
                return;
            }
            return;
        }
        int i = DefaultSettingsSpiCall.C33194.MediaBrowserCompat$ItemReceiver[crashlyticsReportJsonTransform$$Lambda$8.ordinal()];
        if (i == 1) {
            String str = adddelayedshutdownhook.RatingCompat;
            getSessionData getsessiondata = new getSessionData(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_district_hint), String.format(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_district_header), new Object[]{str}), write, str);
            if (defaultSettingsSpiCall.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getsessiondata.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
            }
        } else if (i == 2) {
            String str2 = adddelayedshutdownhook.read;
            Settings settings = new Settings(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_sub_district_hint), String.format(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_sub_district_header), new Object[]{str2}), write, str2);
            if (defaultSettingsSpiCall.RatingCompat != null) {
                z = true;
            }
            if (z) {
                settings.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
            }
        } else if (i == 3) {
            String str3 = adddelayedshutdownhook.MediaDescriptionCompat;
            AppSettingsData appSettingsData = new AppSettingsData(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_postal_hint), String.format(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_postal_header), new Object[]{str3}), write, str3);
            if (defaultSettingsSpiCall.RatingCompat != null) {
                z = true;
            }
            if (z) {
                appSettingsData.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
            }
        }
    }
}
