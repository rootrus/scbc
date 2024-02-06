package p040o;

import com.scb.phone.view.fragment.transferandpay.SuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity$MediaBrowserCompat$ItemReceiver */
final class C6325x147f1e7f implements HistoryAdapter$GroupFooterViewHolder {
    private final WeakReference<SuccessFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean read;

    /* synthetic */ C6325x147f1e7f(SuccessFragment successFragment, boolean z, byte b) {
        this(successFragment, z);
    }

    private C6325x147f1e7f(SuccessFragment successFragment, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(successFragment);
        this.read = z;
    }

    public final void write() {
        SuccessFragment successFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (successFragment != null) {
            successFragment.requestPermissions(ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity.write, 61);
        }
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
            SuccessFragment.IconCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer() {
        SuccessFragment successFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (successFragment != null) {
            successFragment.IconCompatParcelizer(this.read);
        }
    }
}
