package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;

/* renamed from: o.oA */
public final /* synthetic */ class C7271oA implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DepositDetailActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7271oA(DepositDetailActivity depositDetailActivity) {
        this.MediaBrowserCompat$ItemReceiver = depositDetailActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        DepositDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, (Intent) obj);
    }
}
