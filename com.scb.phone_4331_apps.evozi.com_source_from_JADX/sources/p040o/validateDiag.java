package p040o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;

/* renamed from: o.validateDiag */
public interface validateDiag<GVH extends RecyclerView.setContentView, CVH extends RecyclerView.setContentView> {
    long IconCompatParcelizer(int i);

    void MediaBrowserCompat$CustomActionResultReceiver(CVH cvh, int i, int i2);

    int MediaBrowserCompat$ItemReceiver();

    void MediaBrowserCompat$ItemReceiver(GVH gvh, int i);

    int MediaMetadataCompat(int i);

    /* renamed from: a_ */
    boolean mo20940a_(GVH gvh);

    int read(int i);

    CVH read(ViewGroup viewGroup, int i);

    int write();

    long write(int i);

    GVH write(ViewGroup viewGroup, int i);

    void write(GVH gvh, int i);

    void write(CVH cvh, int i, int i2);
}
