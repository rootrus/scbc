package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAsBigInteger */
public final /* synthetic */ class getAsBigInteger implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Boolean read;
    private final /* synthetic */ boolean write;

    public /* synthetic */ getAsBigInteger(Boolean bool, boolean z, boolean z2, boolean z3, boolean z4) {
        this.read = bool;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.write = z3;
        this.MediaBrowserCompat$CustomActionResultReceiver = z4;
    }

    public final void IconCompatParcelizer(Object obj) {
        C$Gson$Preconditions.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, (getSignatureImage) obj);
    }
}
