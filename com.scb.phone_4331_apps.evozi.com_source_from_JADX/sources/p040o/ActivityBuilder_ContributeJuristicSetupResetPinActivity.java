package p040o;

import com.scb.phone.view.fragment.profilemanagement.manageaccounts.AccountManagementFragment;
import p040o.VideoPlayerCameraPlayer;

/* renamed from: o.ActivityBuilder_ContributeJuristicSetupResetPinActivity */
public final /* synthetic */ class ActivityBuilder_ContributeJuristicSetupResetPinActivity implements updateDevice$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ AccountManagementFragment read;

    public /* synthetic */ ActivityBuilder_ContributeJuristicSetupResetPinActivity(AccountManagementFragment accountManagementFragment) {
        this.read = accountManagementFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        VideoPlayerCameraPlayer.C3943b bVar = this.read.presenter;
        C4799il ilVar = C4799il.IconCompatParcelizer;
        if (bVar.RatingCompat != null) {
            ilVar.IconCompatParcelizer(bVar.RatingCompat);
        }
    }
}
