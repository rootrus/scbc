package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.C4316e;
import p040o.Synchronized;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;
import p040o.zzdy;

/* renamed from: o.rS */
public final /* synthetic */ class C5201rS implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ C4316e.C43171.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C5201rS(C4316e.C43171.read read, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        double d;
        C4316e.C43171.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.IconCompatParcelizer;
        getTopLeftCornerWidth.write write = (getTopLeftCornerWidth.write) obj;
        Synchronized.SynchronizedSet unused = C4316e.C43171.this.write;
        show show = new show(list);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, Synchronized.SynchronizedListMultimap.MediaBrowserCompat$ItemReceiver));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                d = ((zzdy.zze) t).read.doubleValue();
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            d = 0.0d;
        }
        write.read(Synchronized.SynchronizedSet.write(Double.valueOf(d)));
    }
}
