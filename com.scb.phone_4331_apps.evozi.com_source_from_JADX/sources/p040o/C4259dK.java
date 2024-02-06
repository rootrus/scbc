package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dK */
public final /* synthetic */ class C4259dK implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ dN$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4259dK(dN$MediaBrowserCompat$ItemReceiver dn_mediabrowsercompat_itemreceiver, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dn_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        dN$MediaBrowserCompat$ItemReceiver dn_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getAdditionalLeftScanLinesWidth) obj).write(dn_mediabrowsercompat_itemreceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
