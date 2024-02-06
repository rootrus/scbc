package p040o;

import android.view.View;
import com.scb.phone.view.adapter.profilemanagement.ProfileManagementAdapter;

/* renamed from: o.deleteDevice */
public final /* synthetic */ class deleteDevice implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ProfileManagementAdapter write;

    public /* synthetic */ deleteDevice(ProfileManagementAdapter profileManagementAdapter, int i) {
        this.write = profileManagementAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        ProfileManagementAdapter profileManagementAdapter = this.write;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindCheckScbsEligibilityFragment fragmentBuilder_BindCheckScbsEligibilityFragment = profileManagementAdapter.write;
        if (fragmentBuilder_BindCheckScbsEligibilityFragment != null) {
            fragmentBuilder_BindCheckScbsEligibilityFragment.MediaBrowserCompat$CustomActionResultReceiver(profileManagementAdapter.MediaBrowserCompat$ItemReceiver.get(i).read);
        }
    }
}
