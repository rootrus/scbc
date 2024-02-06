package p040o;

import com.scb.phone.view.fragment.chubb.ChubbPaySuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.getAllTilesList$MediaBrowserCompat$ItemReceiver */
final class getAllTilesList$MediaBrowserCompat$ItemReceiver implements HistoryAdapter$GroupFooterViewHolder {
    private final WeakReference<ChubbPaySuccessFragment> read;
    private final boolean write;

    /* synthetic */ getAllTilesList$MediaBrowserCompat$ItemReceiver(ChubbPaySuccessFragment chubbPaySuccessFragment, boolean z, byte b) {
        this(chubbPaySuccessFragment, z);
    }

    private getAllTilesList$MediaBrowserCompat$ItemReceiver(ChubbPaySuccessFragment chubbPaySuccessFragment, boolean z) {
        this.read = new WeakReference<>(chubbPaySuccessFragment);
        this.write = z;
    }

    public final void write() {
        ChubbPaySuccessFragment chubbPaySuccessFragment = this.read.get();
        if (chubbPaySuccessFragment != null) {
            chubbPaySuccessFragment.requestPermissions(getAllTilesList.MediaBrowserCompat$CustomActionResultReceiver, 11);
        }
    }

    public final void read() {
        if (this.read.get() != null) {
            ChubbPaySuccessFragment.MediaMetadataCompat();
        }
    }

    public final void IconCompatParcelizer() {
        ChubbPaySuccessFragment chubbPaySuccessFragment = this.read.get();
        if (chubbPaySuccessFragment != null) {
            chubbPaySuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }
}
