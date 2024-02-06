package p040o;

import com.scb.phone.view.fragment.accountsummary.CreditCardFragment;

/* renamed from: o.getBankingServiceTiles */
public final /* synthetic */ class getBankingServiceTiles implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ CreditCardFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getBankingServiceTiles(CreditCardFragment creditCardFragment) {
        this.MediaBrowserCompat$ItemReceiver = creditCardFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.creditCardPresenter.write(this.MediaBrowserCompat$ItemReceiver.setStackedBackground());
    }
}
