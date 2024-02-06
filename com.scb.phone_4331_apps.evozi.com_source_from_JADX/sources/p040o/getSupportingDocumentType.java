package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;

/* renamed from: o.getSupportingDocumentType */
public final /* synthetic */ class getSupportingDocumentType implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashContactInformationFragment read;

    public /* synthetic */ getSupportingDocumentType(EasycashContactInformationFragment easycashContactInformationFragment) {
        this.read = easycashContactInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EasycashContactInformationFragment easycashContactInformationFragment = this.read;
        dialogInterface.dismiss();
        if (easycashContactInformationFragment.getActivity() != null) {
            easycashContactInformationFragment.getActivity().onBackPressed();
        }
    }
}
