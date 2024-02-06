package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.requesttopay.EnterProxyFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributePreregistrationLandingActivity */
public final class ActivityBuilder_ContributePreregistrationLandingActivity {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.READ_CONTACTS"};

    public static void MediaBrowserCompat$ItemReceiver(EnterProxyFragment enterProxyFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(enterProxyFragment.requireActivity(), MediaBrowserCompat$ItemReceiver)) {
            enterProxyFragment.MediaBrowserCompat$MediaItem();
        } else if (ProxySourceAdapter$ItemViewHolder.write(enterProxyFragment, MediaBrowserCompat$ItemReceiver)) {
            write write2 = new write(enterProxyFragment, (byte) 0);
            if (enterProxyFragment.getUserVisibleHint()) {
                CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(enterProxyFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_read_contacts_title).IconCompatParcelizer((int) R.string.permission_read_contacts);
                CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new ActivityBuilder_ContributePrepaidSuccessfulActivationActivity(write2));
                IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new ActivityBuilder_ContributePrepaidTravelCoachMarkActivity(write2)).show();
            }
        } else {
            enterProxyFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 18);
        }
    }

    public static void write(EnterProxyFragment enterProxyFragment, int i, int[] iArr) {
        if (i != 18) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            enterProxyFragment.MediaBrowserCompat$MediaItem();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(enterProxyFragment, MediaBrowserCompat$ItemReceiver)) {
            if (enterProxyFragment.getUserVisibleHint()) {
                enterProxyFragment.IconCompatParcelizer(R.string.permission_read_contacts_never_ask_again, getOversizeImage.ERROR);
            }
        } else if (enterProxyFragment.getUserVisibleHint()) {
            enterProxyFragment.IconCompatParcelizer(R.string.permission_read_contacts_denied, getOversizeImage.ERROR);
        }
    }

    /* renamed from: o.ActivityBuilder_ContributePreregistrationLandingActivity$write */
    static final class write implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<EnterProxyFragment> IconCompatParcelizer;

        /* synthetic */ write(EnterProxyFragment enterProxyFragment, byte b) {
            this(enterProxyFragment);
        }

        private write(EnterProxyFragment enterProxyFragment) {
            this.IconCompatParcelizer = new WeakReference<>(enterProxyFragment);
        }

        public final void write() {
            EnterProxyFragment enterProxyFragment = this.IconCompatParcelizer.get();
            if (enterProxyFragment != null) {
                enterProxyFragment.requestPermissions(ActivityBuilder_ContributePreregistrationLandingActivity.MediaBrowserCompat$ItemReceiver, 18);
            }
        }

        public final void read() {
            EnterProxyFragment enterProxyFragment = this.IconCompatParcelizer.get();
            if (enterProxyFragment != null && enterProxyFragment.getUserVisibleHint()) {
                enterProxyFragment.IconCompatParcelizer(R.string.permission_read_contacts_denied, getOversizeImage.ERROR);
            }
        }
    }
}
