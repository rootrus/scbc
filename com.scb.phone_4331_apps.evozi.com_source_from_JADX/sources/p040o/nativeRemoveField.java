package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeRemoveField */
public final /* synthetic */ class nativeRemoveField implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeRemoveField(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, (IdCaptureModule_GetIParametersFactory) obj);
    }
}
