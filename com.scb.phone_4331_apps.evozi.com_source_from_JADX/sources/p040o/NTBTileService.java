package p040o;

import com.scb.phone.view.fragment.accountsummary.DebitCardFragment;

/* renamed from: o.NTBTileService */
public final /* synthetic */ class NTBTileService implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DebitCardFragment IconCompatParcelizer;

    public /* synthetic */ NTBTileService(DebitCardFragment debitCardFragment) {
        this.IconCompatParcelizer = debitCardFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.IconCompatParcelizer.debitCardPresenter.write();
    }
}
