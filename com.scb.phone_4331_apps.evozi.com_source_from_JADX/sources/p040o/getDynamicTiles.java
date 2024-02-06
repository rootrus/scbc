package p040o;

import com.scb.phone.view.fragment.accountsummary.DebitCardFragment;

/* renamed from: o.getDynamicTiles */
public final /* synthetic */ class getDynamicTiles implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DebitCardFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDynamicTiles(DebitCardFragment debitCardFragment) {
        this.MediaBrowserCompat$ItemReceiver = debitCardFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.debitCardPresenter.write();
    }
}
