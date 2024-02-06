package p040o;

import com.scb.phone.view.fragment.prelogin.quickpromptpay.QuickPromptPayFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity */
public final class ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.READ_CONTACTS"};

    public static void IconCompatParcelizer(QuickPromptPayFragment quickPromptPayFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(quickPromptPayFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            quickPromptPayFragment.mCustomProxyNumber.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (ProxySourceAdapter$ItemViewHolder.write(quickPromptPayFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            quickPromptPayFragment.read((HistoryAdapter$GroupFooterViewHolder_ViewBinding) new write(quickPromptPayFragment, (byte) 0));
        } else {
            quickPromptPayFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 45);
        }
    }

    public static void read(QuickPromptPayFragment quickPromptPayFragment, int i, int[] iArr) {
        if (i != 45) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            quickPromptPayFragment.mCustomProxyNumber.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(quickPromptPayFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            quickPromptPayFragment.RatingCompat();
        } else {
            quickPromptPayFragment.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity$write */
    static final class write implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<QuickPromptPayFragment> write;

        /* synthetic */ write(QuickPromptPayFragment quickPromptPayFragment, byte b) {
            this(quickPromptPayFragment);
        }

        private write(QuickPromptPayFragment quickPromptPayFragment) {
            this.write = new WeakReference<>(quickPromptPayFragment);
        }

        public final void write() {
            QuickPromptPayFragment quickPromptPayFragment = this.write.get();
            if (quickPromptPayFragment != null) {
                quickPromptPayFragment.requestPermissions(ActivityBuilder_ContributeHmlNTBVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, 45);
            }
        }

        public final void read() {
            QuickPromptPayFragment quickPromptPayFragment = this.write.get();
            if (quickPromptPayFragment != null) {
                quickPromptPayFragment.MediaBrowserCompat$SearchResultReceiver();
            }
        }
    }
}
