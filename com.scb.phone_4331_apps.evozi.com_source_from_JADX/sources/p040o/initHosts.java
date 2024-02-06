package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.initHosts */
public final /* synthetic */ class initHosts implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SendImage MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ initHosts(SendImage sendImage) {
        this.MediaBrowserCompat$ItemReceiver = sendImage;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentSkewAngle) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.write);
    }
}
