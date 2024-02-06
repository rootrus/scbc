package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.fragment.ndid.NdidInstructionFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.ActivityBuilder_ContributeFastPayTransferReviewActivity */
public final /* synthetic */ class ActivityBuilder_ContributeFastPayTransferReviewActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ NdidInstructionFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeFastPayTransferReviewActivity(NdidInstructionFragment ndidInstructionFragment) {
        this.MediaBrowserCompat$ItemReceiver = ndidInstructionFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        NdidInstructionFragment ndidInstructionFragment = this.MediaBrowserCompat$ItemReceiver;
        dialogInterface.dismiss();
        FragmentActivity activity = ndidInstructionFragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent(ndidInstructionFragment.getActivity(), NTBLandingActivity.class);
            intent.addFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            NdidInstructionFragment.read(ndidInstructionFragment, intent);
            activity.finish();
        }
    }
}
