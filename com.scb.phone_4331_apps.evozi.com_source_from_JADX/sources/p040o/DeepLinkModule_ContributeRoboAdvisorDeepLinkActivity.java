package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.fastpay.FastPaySuccessFragment;

/* renamed from: o.DeepLinkModule_ContributeRoboAdvisorDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeRoboAdvisorDeepLinkActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FastPaySuccessFragment write;

    public /* synthetic */ DeepLinkModule_ContributeRoboAdvisorDeepLinkActivity(FastPaySuccessFragment fastPaySuccessFragment) {
        this.write = fastPaySuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        FastPaySuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, (Uri) obj);
    }
}
