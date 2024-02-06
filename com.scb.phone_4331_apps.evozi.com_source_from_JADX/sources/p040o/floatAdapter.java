package p040o;

import p040o.access$2300;
import p040o.toJsonTree;
import p040o.writeUInt64NoTag;

/* renamed from: o.floatAdapter */
public final /* synthetic */ class floatAdapter implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ toJsonTree.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ floatAdapter(toJsonTree.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        toJsonTree.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getLicense) obj).write(toJsonTree.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
