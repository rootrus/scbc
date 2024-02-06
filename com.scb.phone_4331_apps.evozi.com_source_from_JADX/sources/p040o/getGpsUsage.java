package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGpsUsage */
public final /* synthetic */ class getGpsUsage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ surfaceDestroyed MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getGpsUsage(surfaceDestroyed surfacedestroyed, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = surfacedestroyed;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        surfaceDestroyed surfacedestroyed = this.MediaBrowserCompat$CustomActionResultReceiver;
        injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem injectrtticheckdeserializer_mediabrowsercompat_mediaitem = (injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem) obj;
        injectrtticheckdeserializer_mediabrowsercompat_mediaitem.write(surfacedestroyed.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
        injectrtticheckdeserializer_mediabrowsercompat_mediaitem.aj_();
    }
}
