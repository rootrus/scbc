package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.transferandpay.TopUpFavouriteTargetFragment;

/* renamed from: o.ActivityBuilder_ContributeWithdrawQRActivity */
public final /* synthetic */ class ActivityBuilder_ContributeWithdrawQRActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ TopUpFavouriteTargetFragment write;

    public /* synthetic */ ActivityBuilder_ContributeWithdrawQRActivity(TopUpFavouriteTargetFragment topUpFavouriteTargetFragment) {
        this.write = topUpFavouriteTargetFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        TopUpFavouriteTargetFragment.MediaBrowserCompat$ItemReceiver(this.write, (Intent) obj);
    }
}
