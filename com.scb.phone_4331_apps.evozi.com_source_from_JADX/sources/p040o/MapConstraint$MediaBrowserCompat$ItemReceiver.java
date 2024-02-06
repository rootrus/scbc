package p040o;

import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.MapConstraint$MediaBrowserCompat$ItemReceiver */
public final class MapConstraint$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver, setBatteryLevel> {
    public static final MapConstraint$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new MapConstraint$MediaBrowserCompat$ItemReceiver();

    MapConstraint$MediaBrowserCompat$ItemReceiver() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver prepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver = (PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver) obj;
        onGetStartedClick.write((Object) prepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver, "it");
        return new setBatteryLevel(prepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
    }
}
