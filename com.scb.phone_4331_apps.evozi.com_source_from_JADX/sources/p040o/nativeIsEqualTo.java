package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsEqualTo */
public final /* synthetic */ class nativeIsEqualTo implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ nativeConfigure write;

    public /* synthetic */ nativeIsEqualTo(nativeConfigure nativeconfigure, boolean z) {
        this.write = nativeconfigure;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure nativeconfigure = this.write;
        ((IdCaptureModule_GetIParametersFactory) obj).read(this.MediaBrowserCompat$ItemReceiver && nativeconfigure.MediaBrowserCompat$ItemReceiver != null && (nativeconfigure.PlaybackStateCompat || nativeconfigure.PlaybackStateCompat$CustomAction));
    }
}
