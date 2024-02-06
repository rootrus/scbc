package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sJ$MediaBrowserCompat$CustomActionResultReceiver  reason: case insensitive filesystem */
final class C10886sJ$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.AppCompatDialogFragment> {
    private /* synthetic */ C7435sJ IconCompatParcelizer;
    private /* synthetic */ panoramaId read;

    C10886sJ$MediaBrowserCompat$CustomActionResultReceiver(C7435sJ sJVar, panoramaId panoramaid) {
        this.IconCompatParcelizer = sJVar;
        this.read = panoramaid;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.AppCompatDialogFragment) obj).read(this.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver(this.read), this.IconCompatParcelizer.IconCompatParcelizer);
    }
}
