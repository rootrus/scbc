package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.fragment.easycash.creditpower.EasycashCreditPowerInformationFragment;

/* renamed from: o.getPrepaidRequestVerification */
public final /* synthetic */ class getPrepaidRequestVerification implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashCreditPowerInformationFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getPrepaidRequestVerification(EasycashCreditPowerInformationFragment easycashCreditPowerInformationFragment) {
        this.MediaBrowserCompat$ItemReceiver = easycashCreditPowerInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.getActivity());
    }
}
