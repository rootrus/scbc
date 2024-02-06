package p040o;

import p040o.TypeAdapters;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapters$10$MediaBrowserCompat$ItemReceiver */
final class TypeAdapters$10$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopEdgeTearHeight> {
    private /* synthetic */ Throwable IconCompatParcelizer;
    private /* synthetic */ TypeAdapters.C388010 write;

    TypeAdapters$10$MediaBrowserCompat$ItemReceiver(TypeAdapters.C388010 r1, Throwable th) {
        this.write = r1;
        this.IconCompatParcelizer = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final getTopEdgeTearHeight gettopedgetearheight = (getTopEdgeTearHeight) obj;
        gettopedgetearheight.aj_();
        gettopedgetearheight.write(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, (Runnable) new Runnable() {
            public final void run() {
                gettopedgetearheight.MediaBrowserCompat$ItemReceiver();
            }
        }));
    }
}
