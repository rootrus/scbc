package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.landingpage.GroupFavoriteFragment;

/* renamed from: o.ActivityBuilder_ContributeDebitCardRequestInputActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDebitCardRequestInputActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ GroupFavoriteFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeDebitCardRequestInputActivity(GroupFavoriteFragment groupFavoriteFragment) {
        this.MediaBrowserCompat$ItemReceiver = groupFavoriteFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        GroupFavoriteFragment.read(this.MediaBrowserCompat$ItemReceiver, (Intent) obj);
    }
}
