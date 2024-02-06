package p040o;

import com.scb.phone.view.fragment.profilemanagement.ProfileManagementFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlVerifyEmailSuccessfulActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlVerifyEmailSuccessfulActivity implements Runnable {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ ProfileManagementFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlVerifyEmailSuccessfulActivity(ProfileManagementFragment profileManagementFragment, int i) {
        this.MediaBrowserCompat$ItemReceiver = profileManagementFragment;
        this.IconCompatParcelizer = i;
    }

    public final void run() {
        ProfileManagementFragment profileManagementFragment = this.MediaBrowserCompat$ItemReceiver;
        profileManagementFragment.mRecyclerView.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }
}
