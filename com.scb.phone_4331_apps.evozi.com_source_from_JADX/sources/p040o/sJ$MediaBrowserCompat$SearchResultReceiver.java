package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sJ$MediaBrowserCompat$SearchResultReceiver */
final class sJ$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.AppCompatDialogFragment> {
    private /* synthetic */ panoramaId MediaBrowserCompat$CustomActionResultReceiver;

    sJ$MediaBrowserCompat$SearchResultReceiver(panoramaId panoramaid) {
        this.MediaBrowserCompat$CustomActionResultReceiver = panoramaid;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.AppCompatDialogFragment) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource);
    }
}
