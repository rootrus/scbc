package p040o;

import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rO */
public final /* synthetic */ class C10122rO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ e$1$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ C10122rO(e$1$MediaBrowserCompat$ItemReceiver e_1_mediabrowsercompat_itemreceiver, Throwable th) {
        this.read = e_1_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        e$1$MediaBrowserCompat$ItemReceiver e_1_mediabrowsercompat_itemreceiver = this.read;
        ((getTopLeftCornerWidth.write) obj).MediaBrowserCompat$ItemReceiver(e_1_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
