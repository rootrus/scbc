package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.ndid.NdidLandingActivity;
import com.scb.phone.view.fragment.ntb.EkycRouterDialogFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.ActivityBuilder_ContributeHmlBaseAddressActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlBaseAddressActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EkycRouterDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ ActivityBuilder_ContributeHmlBaseAddressActivity(EkycRouterDialogFragment ekycRouterDialogFragment, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ekycRouterDialogFragment;
        this.read = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EkycRouterDialogFragment ekycRouterDialogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.read) {
            if (ekycRouterDialogFragment.iDeviceCompatibilityHelper.read()) {
                Intent read2 = NdidLandingActivity.read(ekycRouterDialogFragment.getContext());
                read2.addFlags(268435456);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                EkycRouterDialogFragment.MediaBrowserCompat$CustomActionResultReceiver(ekycRouterDialogFragment, read2);
            } else {
                ekycRouterDialogFragment.read();
            }
            ekycRouterDialogFragment.dismiss();
            return;
        }
        if (ekycRouterDialogFragment.iDeviceCompatibilityHelper.MediaBrowserCompat$CustomActionResultReceiver()) {
            ekycRouterDialogFragment.MediaBrowserCompat$MediaItem();
        } else {
            ekycRouterDialogFragment.read();
        }
        ekycRouterDialogFragment.dismiss();
    }
}
