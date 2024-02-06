package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment;

/* renamed from: o.submitFATCA */
public final /* synthetic */ class submitFATCA implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ ChequeSuccessFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ submitFATCA(ChequeSuccessFragment chequeSuccessFragment) {
        this.MediaBrowserCompat$ItemReceiver = chequeSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = (Uri) obj;
    }
}
