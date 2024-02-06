package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.findus.BaseMapTabFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity */
public final class DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity {
    /* access modifiers changed from: private */
    public static final String[] read = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public static void MediaBrowserCompat$CustomActionResultReceiver(BaseMapTabFragment baseMapTabFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(baseMapTabFragment.requireActivity(), read)) {
            baseMapTabFragment.MediaBrowserCompat$ItemReceiver();
        } else if (ProxySourceAdapter$ItemViewHolder.write(baseMapTabFragment, read)) {
            write write2 = new write(baseMapTabFragment, (byte) 0);
            if (baseMapTabFragment.getUserVisibleHint()) {
                CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(baseMapTabFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_location_title).IconCompatParcelizer((int) R.string.permission_location_denied);
                CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new DeepLinkModule_ContributeScbsOnboardDeepLinkActivity(write2));
                IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new DeepLinkModule_ContributeRtpInputDeepLinkActivity(write2)).show();
            }
        } else {
            baseMapTabFragment.requestPermissions(read, 3);
        }
    }

    public static void IconCompatParcelizer(BaseMapTabFragment baseMapTabFragment, int i, int[] iArr) {
        if (i != 3) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            baseMapTabFragment.MediaBrowserCompat$ItemReceiver();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(baseMapTabFragment, read)) {
            baseMapTabFragment.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            baseMapTabFragment.write();
        }
    }

    /* renamed from: o.DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity$write */
    static final class write implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<BaseMapTabFragment> MediaBrowserCompat$ItemReceiver;

        /* synthetic */ write(BaseMapTabFragment baseMapTabFragment, byte b) {
            this(baseMapTabFragment);
        }

        private write(BaseMapTabFragment baseMapTabFragment) {
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(baseMapTabFragment);
        }

        public final void write() {
            BaseMapTabFragment baseMapTabFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (baseMapTabFragment != null) {
                baseMapTabFragment.requestPermissions(DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity.read, 3);
            }
        }

        public final void read() {
            BaseMapTabFragment baseMapTabFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (baseMapTabFragment != null) {
                baseMapTabFragment.write();
            }
        }
    }
}
