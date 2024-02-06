package p040o;

import com.scb.phone.view.fragment.accountsummary.DebitCardFragment;

/* renamed from: o.getETBCheckActiveCASA */
public final /* synthetic */ class getETBCheckActiveCASA implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ DebitCardFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getETBCheckActiveCASA(DebitCardFragment debitCardFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.debitCardPresenter.write();
    }
}
