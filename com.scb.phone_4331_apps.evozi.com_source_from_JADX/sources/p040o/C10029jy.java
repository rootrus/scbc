package p040o;

import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jy */
public final /* synthetic */ class C10029jy implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ kb$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10029jy(kb$MediaBrowserCompat$CustomActionResultReceiver kb_mediabrowsercompat_customactionresultreceiver, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$ItemReceiver = kb_mediabrowsercompat_customactionresultreceiver;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCarbonStrip.IconCompatParcelizer iconCompatParcelizer = (getCarbonStrip.IconCompatParcelizer) obj;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.read.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
