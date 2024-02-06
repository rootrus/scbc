package p040o;

import p040o.inject_base64Decoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsAutoOrientation$MediaBrowserCompat$ItemReceiver */
public final class XVrsAutoOrientation$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<inject_base64Decoder.write> {
    private /* synthetic */ XVrsAutoOrientation MediaBrowserCompat$CustomActionResultReceiver;

    public XVrsAutoOrientation$MediaBrowserCompat$ItemReceiver(XVrsAutoOrientation xVrsAutoOrientation) {
        this.MediaBrowserCompat$CustomActionResultReceiver = xVrsAutoOrientation;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((inject_base64Decoder.write) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
