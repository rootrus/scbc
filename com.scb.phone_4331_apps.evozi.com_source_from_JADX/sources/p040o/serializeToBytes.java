package p040o;

import android.os.SystemClock;
import com.scb.phone.view.fragment.mailingaddress.BaseMailingAddressFragment;

/* renamed from: o.serializeToBytes */
public final /* synthetic */ class serializeToBytes implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BaseMailingAddressFragment.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ serializeToBytes(BaseMailingAddressFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        BaseMailingAddressFragment.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        zzro zzro = (zzro) obj;
        FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindPrepaidTravelServicesTabFragment.read = zzro;
        fragmentBuilder_BindPrepaidTravelServicesTabFragment.write = SystemClock.elapsedRealtime();
        iconCompatParcelizer.write.write(zzro);
    }
}
