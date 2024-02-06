package p040o;

import com.scb.phone.view.fragment.transferandpay.transfer.TransferToPromptPayStep1Fragment;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindBaseAddressFragment */
public final class FragmentBuilder_BindBaseAddressFragment {
    /* access modifiers changed from: private */
    public static final String[] read = {"android.permission.READ_CONTACTS"};

    public static void IconCompatParcelizer(TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(transferToPromptPayStep1Fragment.requireActivity(), read)) {
            transferToPromptPayStep1Fragment.aO_();
        } else if (ProxySourceAdapter$ItemViewHolder.write(transferToPromptPayStep1Fragment, read)) {
            transferToPromptPayStep1Fragment.read((HistoryAdapter$GroupFooterViewHolder_ViewBinding) new IconCompatParcelizer(transferToPromptPayStep1Fragment, (byte) 0));
        } else {
            transferToPromptPayStep1Fragment.requestPermissions(read, 63);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment, int i, int[] iArr) {
        if (i != 63) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            transferToPromptPayStep1Fragment.aO_();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(transferToPromptPayStep1Fragment, read)) {
            transferToPromptPayStep1Fragment.RatingCompat();
        } else {
            transferToPromptPayStep1Fragment.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.FragmentBuilder_BindBaseAddressFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<TransferToPromptPayStep1Fragment> write;

        /* synthetic */ IconCompatParcelizer(TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment, byte b) {
            this(transferToPromptPayStep1Fragment);
        }

        private IconCompatParcelizer(TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment) {
            this.write = new WeakReference<>(transferToPromptPayStep1Fragment);
        }

        public final void write() {
            TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment = this.write.get();
            if (transferToPromptPayStep1Fragment != null) {
                transferToPromptPayStep1Fragment.requestPermissions(FragmentBuilder_BindBaseAddressFragment.read, 63);
            }
        }

        public final void read() {
            TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment = this.write.get();
            if (transferToPromptPayStep1Fragment != null) {
                transferToPromptPayStep1Fragment.MediaBrowserCompat$SearchResultReceiver();
            }
        }
    }
}
