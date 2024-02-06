package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.jk */
public final /* synthetic */ class C4872jk implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ kC$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C4872jk(kC$MediaBrowserCompat$ItemReceiver kc_mediabrowsercompat_itemreceiver, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = kc_mediabrowsercompat_itemreceiver;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        kC$MediaBrowserCompat$ItemReceiver kc_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = this.write;
        if (!kc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            C4889kC kCVar = kc_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
            kCVar.MediaBrowserCompat$ItemReceiver(kCVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
