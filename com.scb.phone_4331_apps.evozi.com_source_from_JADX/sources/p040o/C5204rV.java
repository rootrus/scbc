package p040o;

import java.util.List;
import p040o.C4316e;
import p040o.Synchronized;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;
import p040o.zzdy;

/* renamed from: o.rV */
public final /* synthetic */ class C5204rV implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4316e.C43171.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ C5204rV(C4316e.C43171.read read, List list) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4316e.C43171.read read = this.MediaBrowserCompat$ItemReceiver;
        List list = this.write;
        Synchronized.SynchronizedSet unused = C4316e.C43171.this.write;
        ((getTopLeftCornerWidth.write) obj).read(Synchronized.SynchronizedSet.MediaBrowserCompat$CustomActionResultReceiver((List<zzdy.zze>) list));
    }
}
