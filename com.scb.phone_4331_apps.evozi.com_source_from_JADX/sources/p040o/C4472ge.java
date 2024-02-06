package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ge */
public final /* synthetic */ class C4472ge implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4472ge(boolean z, boolean z2, boolean z3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompat$ItemReceiver = z3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((tX$MediaBrowserCompat$CustomActionResultReceiver) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver && !this.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver);
    }
}
