package p040o;

import com.scb.phone.view.fragment.fastpay.FastPaySuccessFragment;

/* renamed from: o.DeepLinkModule_ContributeRemittanceTransactionsDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeRemittanceTransactionsDeepLinkActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FastPaySuccessFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeepLinkModule_ContributeRemittanceTransactionsDeepLinkActivity(FastPaySuccessFragment fastPaySuccessFragment) {
        this.MediaBrowserCompat$ItemReceiver = fastPaySuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        FastPaySuccessFragment.write(this.MediaBrowserCompat$ItemReceiver, (Throwable) obj);
    }
}
