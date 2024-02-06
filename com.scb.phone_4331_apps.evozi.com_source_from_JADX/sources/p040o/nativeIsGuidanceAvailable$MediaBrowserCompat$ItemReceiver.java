package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsGuidanceAvailable$MediaBrowserCompat$ItemReceiver */
public final class nativeIsGuidanceAvailable$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetLookAndFeelParametersFactory> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public nativeIsGuidanceAvailable$MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetLookAndFeelParametersFactory) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
