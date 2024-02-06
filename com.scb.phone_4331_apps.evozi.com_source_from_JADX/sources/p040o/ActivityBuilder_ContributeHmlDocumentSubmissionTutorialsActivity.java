package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.ntb.ekyc.EkycFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlDocumentSubmissionTutorialsActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlDocumentSubmissionTutorialsActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EkycFragment read;

    public /* synthetic */ ActivityBuilder_ContributeHmlDocumentSubmissionTutorialsActivity(EkycFragment ekycFragment) {
        this.read = ekycFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EkycFragment ekycFragment = this.read;
        dialogInterface.dismiss();
        ekycFragment.getActivity().finish();
    }
}
