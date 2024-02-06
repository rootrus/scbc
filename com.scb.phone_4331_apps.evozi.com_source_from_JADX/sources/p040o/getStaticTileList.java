package p040o;

import com.scb.phone.view.fragment.accountsummary.DebitCardFragment;

/* renamed from: o.getStaticTileList */
public final /* synthetic */ class getStaticTileList implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DebitCardFragment read;

    public /* synthetic */ getStaticTileList(DebitCardFragment debitCardFragment) {
        this.read = debitCardFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.debitCardPresenter.write();
    }
}
