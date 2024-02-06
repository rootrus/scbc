package p040o;

import android.graphics.Bitmap;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver */
public final class TypeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopEdgeTearHeight> {
    private /* synthetic */ standardStartAndWait MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ boolean read;
    private /* synthetic */ Bitmap write;

    public TypeAdapters$10$MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap, standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        this.write = bitmap;
        this.MediaBrowserCompat$CustomActionResultReceiver = standardstartandwait;
        this.read = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getTopEdgeTearHeight) obj).write(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
