package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMHMCInformationFragment;

/* renamed from: o.DeepLinkModule_AddAccountConsentDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_AddAccountConsentDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashFeaturesMHMCInformationFragment IconCompatParcelizer;

    public /* synthetic */ DeepLinkModule_AddAccountConsentDeepLinkActivity(EasycashFeaturesMHMCInformationFragment easycashFeaturesMHMCInformationFragment) {
        this.IconCompatParcelizer = easycashFeaturesMHMCInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EasycashFeaturesMHMCInformationFragment easycashFeaturesMHMCInformationFragment = this.IconCompatParcelizer;
        easycashFeaturesMHMCInformationFragment.getActivity().setResult(-1);
        easycashFeaturesMHMCInformationFragment.getActivity().finish();
        dialogInterface.dismiss();
    }
}
