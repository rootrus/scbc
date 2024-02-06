package p040o;

import com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.JuristicService$MediaBrowserCompat$ItemReceiver */
final class JuristicService$MediaBrowserCompat$ItemReceiver implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
    private final WeakReference<BaseTakePhotoFragment> MediaBrowserCompat$CustomActionResultReceiver;

    /* synthetic */ JuristicService$MediaBrowserCompat$ItemReceiver(BaseTakePhotoFragment baseTakePhotoFragment, byte b) {
        this(baseTakePhotoFragment);
    }

    private JuristicService$MediaBrowserCompat$ItemReceiver(BaseTakePhotoFragment baseTakePhotoFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(baseTakePhotoFragment);
    }

    public final void write() {
        BaseTakePhotoFragment baseTakePhotoFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (baseTakePhotoFragment != null) {
            baseTakePhotoFragment.requestPermissions(JuristicService.write, 5);
        }
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
            BaseTakePhotoFragment.setExpandedFormat();
        }
    }
}
