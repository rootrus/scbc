package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.transferandpay.TransferFavouriteTargetFragment;

/* renamed from: o.ActivityBuilder_ContributeVideoPlaybackActivity */
public final /* synthetic */ class ActivityBuilder_ContributeVideoPlaybackActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ TransferFavouriteTargetFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeVideoPlaybackActivity(TransferFavouriteTargetFragment transferFavouriteTargetFragment) {
        this.MediaBrowserCompat$ItemReceiver = transferFavouriteTargetFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        TransferFavouriteTargetFragment.write(this.MediaBrowserCompat$ItemReceiver, (Intent) obj);
    }
}
