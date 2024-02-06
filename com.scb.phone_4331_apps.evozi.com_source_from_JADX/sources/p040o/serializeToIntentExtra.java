package p040o;

import android.os.SystemClock;
import com.scb.phone.view.fragment.mailingaddress.BaseMailingAddressFragment;

/* renamed from: o.serializeToIntentExtra */
public final /* synthetic */ class serializeToIntentExtra implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BaseMailingAddressFragment.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ serializeToIntentExtra(BaseMailingAddressFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        BaseMailingAddressFragment.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindPrepaidTravelServicesTabFragment.MediaBrowserCompat$CustomActionResultReceiver = (setStartCap) obj;
        fragmentBuilder_BindPrepaidTravelServicesTabFragment.write = SystemClock.elapsedRealtime();
        iconCompatParcelizer.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
    }
}
