package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.profilemanagement.ProfileManagementFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity */
public final class ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void read(ProfileManagementFragment profileManagementFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(profileManagementFragment.requireActivity(), MediaBrowserCompat$ItemReceiver)) {
            VideoPlayerCameraSourceType videoPlayerCameraSourceType = profileManagementFragment.profileManagementPresenter;
            videoPlayerCameraSourceType.MediaDescriptionCompat.read.MediaBrowserCompat$CustomActionResultReceiver(profileManagementFragment.IconCompatParcelizer);
        } else if (ProxySourceAdapter$ItemViewHolder.write(profileManagementFragment, MediaBrowserCompat$ItemReceiver)) {
            read read2 = new read(profileManagementFragment, (byte) 0);
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(profileManagementFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new ActivityBuilder_ContributeHmlSummaryActivity(read2));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new ActivityBuilder_ContributeHmlSimulatorAboutActivity(read2)).show();
        } else {
            profileManagementFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 43);
        }
    }

    public static void write(ProfileManagementFragment profileManagementFragment, int i, int[] iArr) {
        if (i != 43) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            VideoPlayerCameraSourceType videoPlayerCameraSourceType = profileManagementFragment.profileManagementPresenter;
            videoPlayerCameraSourceType.MediaDescriptionCompat.read.MediaBrowserCompat$CustomActionResultReceiver(profileManagementFragment.IconCompatParcelizer);
        } else if (!ProxySourceAdapter$ItemViewHolder.write(profileManagementFragment, MediaBrowserCompat$ItemReceiver)) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
            VideoPlayerCameraSourceType videoPlayerCameraSourceType2 = profileManagementFragment.profileManagementPresenter;
            videoPlayerCameraSourceType2.MediaDescriptionCompat.read.MediaBrowserCompat$CustomActionResultReceiver(profileManagementFragment.IconCompatParcelizer);
        } else {
            profileManagementFragment.setItemInvoker();
        }
    }

    /* renamed from: o.ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<ProfileManagementFragment> read;

        /* synthetic */ read(ProfileManagementFragment profileManagementFragment, byte b) {
            this(profileManagementFragment);
        }

        private read(ProfileManagementFragment profileManagementFragment) {
            this.read = new WeakReference<>(profileManagementFragment);
        }

        public final void write() {
            ProfileManagementFragment profileManagementFragment = this.read.get();
            if (profileManagementFragment != null) {
                profileManagementFragment.requestPermissions(ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity.MediaBrowserCompat$ItemReceiver, 43);
            }
        }

        public final void read() {
            ProfileManagementFragment profileManagementFragment = this.read.get();
            if (profileManagementFragment != null) {
                profileManagementFragment.setItemInvoker();
            }
        }
    }
}
