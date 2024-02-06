package p040o;

import com.scb.phone.view.fragment.accountsummary.PrepaidFragment;

/* renamed from: o.confirmRpRequest */
public final /* synthetic */ class confirmRpRequest implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ PrepaidFragment write;

    public /* synthetic */ confirmRpRequest(PrepaidFragment prepaidFragment) {
        this.write = prepaidFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.write.prepaidCardPresenter.IconCompatParcelizer();
    }
}
