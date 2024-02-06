package p040o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;

/* renamed from: o.validateL3 */
public abstract class validateL3<GVH extends RecyclerView.setContentView, CVH extends RecyclerView.setContentView> extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> implements validateDiag<GVH, CVH> {
    public final int IconCompatParcelizer() {
        return 0;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return 0;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return -1;
    }

    public int MediaMetadataCompat(int i) {
        return 0;
    }

    public int write() {
        return 0;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        throw new IllegalStateException("This method should not be called");
    }

    public final void write(GVH gvh, int i) {
        MediaBrowserCompat$ItemReceiver(gvh, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CVH cvh, int i, int i2) {
        write(cvh, i, i2);
    }
}
