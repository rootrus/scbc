package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.accountsummary.AccountSummaryFragment;

/* renamed from: o.verifySwitch */
public final /* synthetic */ class verifySwitch implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ AccountSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ verifySwitch(AccountSummaryFragment accountSummaryFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountSummaryFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        AccountSummaryFragment.write(this.MediaBrowserCompat$CustomActionResultReceiver, (Intent) obj);
    }
}
