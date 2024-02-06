package p040o;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: o.validateDAG */
public final class validateDAG extends RecyclerView.read {
    private final WeakReference<RecyclerView.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
    private final WeakReference<validateDAG$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$ItemReceiver;

    public validateDAG(validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver, RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(validatedag_mediabrowsercompat_customactionresultreceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(iconCompatParcelizer);
    }

    public final void write() {
        validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get();
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (validatedag_mediabrowsercompat_customactionresultreceiver != null && iconCompatParcelizer != null) {
            validatedag_mediabrowsercompat_customactionresultreceiver.write();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get();
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (validatedag_mediabrowsercompat_customactionresultreceiver != null && iconCompatParcelizer != null) {
            validatedag_mediabrowsercompat_customactionresultreceiver.mo17990a_(i, i2);
        }
    }

    public final void IconCompatParcelizer(int i, int i2, Object obj) {
        validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get();
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (validatedag_mediabrowsercompat_customactionresultreceiver != null && iconCompatParcelizer != null) {
            validatedag_mediabrowsercompat_customactionresultreceiver.write(i, i2, obj);
        }
    }

    public final void write(int i, int i2) {
        validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get();
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (validatedag_mediabrowsercompat_customactionresultreceiver != null && iconCompatParcelizer != null) {
            validatedag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(i, i2);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get();
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (validatedag_mediabrowsercompat_customactionresultreceiver != null && iconCompatParcelizer != null) {
            validatedag_mediabrowsercompat_customactionresultreceiver.mo17992b_(i, i2);
        }
    }

    public final void IconCompatParcelizer(int i, int i2) {
        validateDAG$MediaBrowserCompat$CustomActionResultReceiver validatedag_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.get();
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (validatedag_mediabrowsercompat_customactionresultreceiver != null && iconCompatParcelizer != null) {
            validatedag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(i, i2, 1);
        }
    }
}
