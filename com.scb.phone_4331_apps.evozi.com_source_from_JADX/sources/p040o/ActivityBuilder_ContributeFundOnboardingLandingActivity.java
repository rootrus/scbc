package p040o;

import com.scb.phone.view.fragment.ndid.NdidInstructionFragment;

/* renamed from: o.ActivityBuilder_ContributeFundOnboardingLandingActivity */
public final class ActivityBuilder_ContributeFundOnboardingLandingActivity {
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(NdidInstructionFragment ndidInstructionFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(ndidInstructionFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            ndidInstructionFragment.MediaSessionCompat$Token();
        } else {
            ndidInstructionFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 40);
        }
    }

    public static void read(NdidInstructionFragment ndidInstructionFragment, int i, int[] iArr) {
        if (i == 40 && ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            ndidInstructionFragment.MediaSessionCompat$Token();
        }
    }
}
