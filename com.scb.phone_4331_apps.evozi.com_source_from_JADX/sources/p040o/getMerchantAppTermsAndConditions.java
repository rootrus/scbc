package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.chubb.ChubbPaySuccessFragment;

/* renamed from: o.getMerchantAppTermsAndConditions */
public final /* synthetic */ class getMerchantAppTermsAndConditions implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ ChubbPaySuccessFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getMerchantAppTermsAndConditions(ChubbPaySuccessFragment chubbPaySuccessFragment) {
        this.MediaBrowserCompat$ItemReceiver = chubbPaySuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        ChubbPaySuccessFragment.write(this.MediaBrowserCompat$ItemReceiver, (Uri) obj);
    }
}
