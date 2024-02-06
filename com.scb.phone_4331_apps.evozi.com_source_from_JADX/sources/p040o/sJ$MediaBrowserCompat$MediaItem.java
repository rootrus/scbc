package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sJ$MediaBrowserCompat$MediaItem */
final class sJ$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.AppCompatDialogFragment> {
    private /* synthetic */ C7435sJ MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ panoramaId write;

    sJ$MediaBrowserCompat$MediaItem(C7435sJ sJVar, panoramaId panoramaid) {
        this.MediaBrowserCompat$ItemReceiver = sJVar;
        this.write = panoramaid;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.AppCompatDialogFragment) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(this.write));
    }
}
