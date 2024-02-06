package p040o;

import p040o.access$2300;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jN */
public final /* synthetic */ class C4852jN implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ kb$MediaBrowserCompat$MediaItem read;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C4852jN(kb$MediaBrowserCompat$MediaItem kb_mediabrowsercompat_mediaitem, Throwable th) {
        this.read = kb_mediabrowsercompat_mediaitem;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        kb$MediaBrowserCompat$MediaItem kb_mediabrowsercompat_mediaitem = this.read;
        ((getCarbonStrip.IconCompatParcelizer) obj).write(kb_mediabrowsercompat_mediaitem.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.NAVIGATE_BACK));
    }
}
