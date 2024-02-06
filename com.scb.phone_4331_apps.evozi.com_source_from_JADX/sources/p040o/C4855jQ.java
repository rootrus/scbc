package p040o;

import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jQ */
public final /* synthetic */ class C4855jQ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ kb$MediaBrowserCompat$MediaItem read;

    public /* synthetic */ C4855jQ(kb$MediaBrowserCompat$MediaItem kb_mediabrowsercompat_mediaitem) {
        this.read = kb_mediabrowsercompat_mediaitem;
    }

    public final void IconCompatParcelizer(Object obj) {
        kb$MediaBrowserCompat$MediaItem kb_mediabrowsercompat_mediaitem = this.read;
        getCarbonStrip.IconCompatParcelizer iconCompatParcelizer = (getCarbonStrip.IconCompatParcelizer) obj;
        if (kb_mediabrowsercompat_mediaitem.read.MediaDescriptionCompat != null && kb_mediabrowsercompat_mediaitem.read.MediaDescriptionCompat.read > 0.0d) {
            iconCompatParcelizer.write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(kb_mediabrowsercompat_mediaitem.read.MediaDescriptionCompat.read));
            iconCompatParcelizer.read(false);
        }
    }
}
