package p040o;

import com.scb.phone.view.fragment.debitcard.DebitCardSaleSheetFragment;
import p040o.verifyReferral;

/* renamed from: o.getTermsConditionsReferral */
public final /* synthetic */ class getTermsConditionsReferral implements verifyReferral.IconCompatParcelizer {
    private final /* synthetic */ DebitCardSaleSheetFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getTermsConditionsReferral(DebitCardSaleSheetFragment debitCardSaleSheetFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardSaleSheetFragment;
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$CustomActionResultReceiver.write(new QueueFile());
    }
}
