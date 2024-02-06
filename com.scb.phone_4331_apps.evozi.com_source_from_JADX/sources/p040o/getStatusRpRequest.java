package p040o;

import com.scb.phone.view.fragment.accountsummary.PrepaidFragment;

/* renamed from: o.getStatusRpRequest */
public final /* synthetic */ class getStatusRpRequest implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ PrepaidFragment write;

    public /* synthetic */ getStatusRpRequest(PrepaidFragment prepaidFragment) {
        this.write = prepaidFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.write.prepaidCardPresenter.IconCompatParcelizer();
    }
}
