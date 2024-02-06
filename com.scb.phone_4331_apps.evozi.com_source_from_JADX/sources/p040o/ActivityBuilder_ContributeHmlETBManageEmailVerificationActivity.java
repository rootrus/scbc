package p040o;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeHmlETBManageEmailVerificationActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlETBManageEmailVerificationActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FatcaLandingQuestionFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlETBManageEmailVerificationActivity(FatcaLandingQuestionFragment fatcaLandingQuestionFragment) {
        this.MediaBrowserCompat$ItemReceiver = fatcaLandingQuestionFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = this.MediaBrowserCompat$ItemReceiver;
        dialogInterface.dismiss();
        int i2 = fatcaLandingQuestionFragment.fatcaLandingPresenter.IconCompatParcelizer;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            fatcaLandingQuestionFragment.mo15340x50fd9e4a(false);
        } else if (i2 != 4) {
            FragmentActivity activity = fatcaLandingQuestionFragment.getActivity();
            if (activity != null) {
                FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference((BaseActivity) fatcaLandingQuestionFragment.getActivity()));
                activity.finish();
            }
        } else {
            fatcaLandingQuestionFragment.getActivity().finish();
        }
    }
}
