package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.resolveTypeVariable */
public final /* synthetic */ class resolveTypeVariable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ resolveTypeVariable(boolean z, boolean z2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
    }

    public final void IconCompatParcelizer(Object obj) {
        newParameterizedTypeWithOwner.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, (IdCaptureBackActivity) obj);
    }
}
