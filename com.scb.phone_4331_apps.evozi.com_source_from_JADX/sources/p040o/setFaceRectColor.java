package p040o;

import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.setFaceRectColor */
public final /* synthetic */ class setFaceRectColor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLastKnownLocation$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ setFaceRectColor(getLastKnownLocation$MediaBrowserCompat$ItemReceiver getlastknownlocation_mediabrowsercompat_itemreceiver, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = getlastknownlocation_mediabrowsercompat_itemreceiver;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getLastKnownLocation$MediaBrowserCompat$ItemReceiver getlastknownlocation_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        ((getTopLeftCornerWidth.PlaybackStateCompat.CustomAction) obj).write(getlastknownlocation_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.NAVIGATE_BACK));
    }
}
