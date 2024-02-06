package p040o;

import com.scb.phone.view.fragment.etb.ETBMarketConductDetailFragment;
import p040o.verifyReferral;

/* renamed from: o.DeepLinkModule_ContributeLoanDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeLoanDeepLinkActivity implements verifyReferral.IconCompatParcelizer {
    private final /* synthetic */ ETBMarketConductDetailFragment write;

    public /* synthetic */ DeepLinkModule_ContributeLoanDeepLinkActivity(ETBMarketConductDetailFragment eTBMarketConductDetailFragment) {
        this.write = eTBMarketConductDetailFragment;
    }

    public final void IconCompatParcelizer() {
        this.write.btnRead.setEnabled(true);
    }
}
