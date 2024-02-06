package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.debitatm.DebitCardServiceTabFragment;

/* renamed from: o.validateSpeedyLoanEligibility */
public final /* synthetic */ class validateSpeedyLoanEligibility implements DialogInterface.OnClickListener {
    private final /* synthetic */ DebitCardServiceTabFragment write;

    public /* synthetic */ validateSpeedyLoanEligibility(DebitCardServiceTabFragment debitCardServiceTabFragment) {
        this.write = debitCardServiceTabFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DebitCardServiceTabFragment debitCardServiceTabFragment = this.write;
        debitCardServiceTabFragment.tabDebitCardServicePresenter.IconCompatParcelizer(debitCardServiceTabFragment.IconCompatParcelizer.MediaBrowserCompat$MediaItem);
    }
}
