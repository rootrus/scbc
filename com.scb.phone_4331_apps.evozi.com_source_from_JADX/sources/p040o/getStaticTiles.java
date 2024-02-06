package p040o;

import com.scb.phone.view.fragment.accountsummary.PrepaidFragment;

/* renamed from: o.getStaticTiles */
public final /* synthetic */ class getStaticTiles implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ PrepaidFragment read;

    public /* synthetic */ getStaticTiles(PrepaidFragment prepaidFragment) {
        this.read = prepaidFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.prepaidCardPresenter.IconCompatParcelizer();
    }
}
