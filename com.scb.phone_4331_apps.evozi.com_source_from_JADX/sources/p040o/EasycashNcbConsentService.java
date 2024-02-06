package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.debitcard.DebitCardRequestSuccessFragment;

/* renamed from: o.EasycashNcbConsentService */
public final /* synthetic */ class EasycashNcbConsentService implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DebitCardRequestSuccessFragment IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ EasycashNcbConsentService(DebitCardRequestSuccessFragment debitCardRequestSuccessFragment, boolean z) {
        this.IconCompatParcelizer = debitCardRequestSuccessFragment;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.IconCompatParcelizer.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$ItemReceiver);
    }
}
