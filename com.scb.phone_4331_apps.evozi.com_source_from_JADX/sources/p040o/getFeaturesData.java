package p040o;

import p040o.DiscoverFundPerformanceActivity;

/* renamed from: o.getFeaturesData */
public final /* synthetic */ class getFeaturesData implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DefaultSettingsSpiCall IconCompatParcelizer;

    public /* synthetic */ getFeaturesData(DefaultSettingsSpiCall defaultSettingsSpiCall) {
        this.IconCompatParcelizer = defaultSettingsSpiCall;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultSettingsSpiCall defaultSettingsSpiCall = this.IconCompatParcelizer;
        DiscoverFundPerformanceActivity.read read = (DiscoverFundPerformanceActivity.read) obj;
        boolean z = true;
        if (defaultSettingsSpiCall.RatingCompat != null) {
            defaultSettingsSpiCall.RatingCompat.aj_();
        }
        getAppSettingsData getappsettingsdata = new getAppSettingsData(defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_province_hint), defaultSettingsSpiCall.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.address_subdistrict_search_province_header), defaultSettingsSpiCall.IconCompatParcelizer.write(read));
        if (defaultSettingsSpiCall.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getappsettingsdata.IconCompatParcelizer(defaultSettingsSpiCall.RatingCompat);
        }
    }
}
