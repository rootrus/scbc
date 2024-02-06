package p040o;

import android.app.Dialog;
import com.scb.phone.view.fragment.debitcard.DebitCardSaleSheetFragment;
import p040o.verifyReferral;

/* renamed from: o.postLoanDetail */
public final /* synthetic */ class postLoanDetail implements verifyReferral.IconCompatParcelizer {
    private final /* synthetic */ DebitCardSaleSheetFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ postLoanDetail(DebitCardSaleSheetFragment debitCardSaleSheetFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardSaleSheetFragment;
    }

    public final void IconCompatParcelizer() {
        DebitCardSaleSheetFragment debitCardSaleSheetFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Dialog dialog = debitCardSaleSheetFragment.write;
        if (dialog != null && dialog.isShowing()) {
            debitCardSaleSheetFragment.write.dismiss();
            debitCardSaleSheetFragment.write = null;
        }
    }
}
