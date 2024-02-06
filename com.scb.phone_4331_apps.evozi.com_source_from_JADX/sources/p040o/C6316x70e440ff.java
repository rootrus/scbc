package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.fillinformation.FillInformationFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeHmlExternalAuthenticationDeepLinkActivity */
public final /* synthetic */ class C6316x70e440ff implements DialogInterface.OnClickListener {
    private final /* synthetic */ FillInformationFragment read;

    public /* synthetic */ C6316x70e440ff(FillInformationFragment fillInformationFragment) {
        this.read = fillInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FillInformationFragment fillInformationFragment = this.read;
        dialogInterface.dismiss();
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference((BaseActivity) fillInformationFragment.getActivity()));
    }
}
