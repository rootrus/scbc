package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.cacheVariant */
public final /* synthetic */ class cacheVariant implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ HomeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ cacheVariant(HomeActivity homeActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = homeActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        HomeActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (Intent) obj);
    }
}
