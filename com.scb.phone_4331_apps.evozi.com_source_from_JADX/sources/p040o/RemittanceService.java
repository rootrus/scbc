package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesLoanInformationFragment;

/* renamed from: o.RemittanceService */
public final /* synthetic */ class RemittanceService implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashFeaturesLoanInformationFragment IconCompatParcelizer;

    public /* synthetic */ RemittanceService(EasycashFeaturesLoanInformationFragment easycashFeaturesLoanInformationFragment) {
        this.IconCompatParcelizer = easycashFeaturesLoanInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
    }
}
