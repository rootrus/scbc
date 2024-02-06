package p040o;

import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import p040o.setTitleMarginStart;

/* renamed from: o.setSelectedDate */
public final /* synthetic */ class setSelectedDate implements setTitleMarginStart.IconCompatParcelizer {
    private final /* synthetic */ ProfileManagementActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setSelectedDate(ProfileManagementActivity profileManagementActivity) {
        this.MediaBrowserCompat$ItemReceiver = profileManagementActivity;
    }

    public final void write() {
        ProfileManagementActivity profileManagementActivity = this.MediaBrowserCompat$ItemReceiver;
        if (profileManagementActivity.getSupportFragmentManager().write() == 0) {
            profileManagementActivity.setStackedBackground();
        }
    }
}
