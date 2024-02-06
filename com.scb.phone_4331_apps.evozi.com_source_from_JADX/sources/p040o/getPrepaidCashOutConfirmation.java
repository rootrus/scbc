package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;

/* renamed from: o.getPrepaidCashOutConfirmation */
public final /* synthetic */ class getPrepaidCashOutConfirmation implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashOccupationInfoFragment read;

    public /* synthetic */ getPrepaidCashOutConfirmation(EasycashOccupationInfoFragment easycashOccupationInfoFragment) {
        this.read = easycashOccupationInfoFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EasycashOccupationInfoFragment easycashOccupationInfoFragment = this.read;
        dialogInterface.dismiss();
        if (easycashOccupationInfoFragment.getActivity() != null) {
            easycashOccupationInfoFragment.getActivity().onBackPressed();
        }
    }
}
