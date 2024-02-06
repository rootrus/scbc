package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.debitcard.DebitCardSuccessfulActivationFragment;

/* renamed from: o.postMHMCDetailCalculation */
public final /* synthetic */ class postMHMCDetailCalculation implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DebitCardSuccessfulActivationFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ postMHMCDetailCalculation(DebitCardSuccessfulActivationFragment debitCardSuccessfulActivationFragment, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardSuccessfulActivationFragment;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$ItemReceiver);
    }
}
