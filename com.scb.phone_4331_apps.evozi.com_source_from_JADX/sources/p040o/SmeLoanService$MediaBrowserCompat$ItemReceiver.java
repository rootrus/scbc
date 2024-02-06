package p040o;

import com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.SmeLoanService$MediaBrowserCompat$ItemReceiver */
final class SmeLoanService$MediaBrowserCompat$ItemReceiver implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
    private final WeakReference<ChequeSuccessFragment> IconCompatParcelizer;

    /* synthetic */ SmeLoanService$MediaBrowserCompat$ItemReceiver(ChequeSuccessFragment chequeSuccessFragment, byte b) {
        this(chequeSuccessFragment);
    }

    private SmeLoanService$MediaBrowserCompat$ItemReceiver(ChequeSuccessFragment chequeSuccessFragment) {
        this.IconCompatParcelizer = new WeakReference<>(chequeSuccessFragment);
    }

    public final void write() {
        ChequeSuccessFragment chequeSuccessFragment = this.IconCompatParcelizer.get();
        if (chequeSuccessFragment != null) {
            chequeSuccessFragment.requestPermissions(SmeLoanService.MediaBrowserCompat$CustomActionResultReceiver, 10);
        }
    }

    public final void read() {
        if (this.IconCompatParcelizer.get() != null) {
            ChequeSuccessFragment.MediaBrowserCompat$MediaItem();
        }
    }
}
