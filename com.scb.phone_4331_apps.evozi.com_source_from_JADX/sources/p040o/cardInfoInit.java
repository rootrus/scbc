package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.creditcard.BilledTabFragment;

/* renamed from: o.cardInfoInit */
public final /* synthetic */ class cardInfoInit implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BilledTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ cardInfoInit(BilledTabFragment billedTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billedTabFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        BilledTabFragment billedTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        billedTabFragment.MediaBrowserCompat$CustomActionResultReceiver.post(new faceMatch(billedTabFragment, (Intent) obj));
    }
}
