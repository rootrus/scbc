package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerView$MediaSessionCompat$QueueItem {
    int MediaBrowserCompat$ItemReceiver = 0;
    SparseArray<write> write = new SparseArray<>();

    static class write {
        long IconCompatParcelizer = 0;
        final ArrayList<RecyclerView.setContentView> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
        int MediaBrowserCompat$ItemReceiver = 5;
        long write = 0;

        write() {
        }
    }

    public final RecyclerView.setContentView read(int i) {
        write write2 = this.write.get(i);
        if (write2 == null || write2.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            return null;
        }
        ArrayList<RecyclerView.setContentView> arrayList = write2.MediaBrowserCompat$CustomActionResultReceiver;
        return arrayList.remove(arrayList.size() - 1);
    }

    static long write(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(int i, long j) {
        write IconCompatParcelizer = IconCompatParcelizer(i);
        long j2 = IconCompatParcelizer.write;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        IconCompatParcelizer.write = j;
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(int i, long j, long j2) {
        long j3 = IconCompatParcelizer(i).write;
        return j3 == 0 || j + j3 < j2;
    }

    /* access modifiers changed from: package-private */
    public final write IconCompatParcelizer(int i) {
        write write2 = this.write.get(i);
        if (write2 != null) {
            return write2;
        }
        write write3 = new write();
        this.write.put(i, write3);
        return write3;
    }

    public final void read(RecyclerView.setContentView setcontentview) {
        int i = setcontentview.MediaBrowserCompat$CustomActionResultReceiver;
        ArrayList<RecyclerView.setContentView> arrayList = IconCompatParcelizer(i).MediaBrowserCompat$CustomActionResultReceiver;
        if (this.write.get(i).MediaBrowserCompat$ItemReceiver > arrayList.size()) {
            setcontentview.MediaBrowserCompat$CustomActionResultReceiver();
            arrayList.add(setcontentview);
        }
    }
}
