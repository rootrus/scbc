package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.SearchDirection */
public final /* synthetic */ class SearchDirection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10829Sizeof.C37931 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ SearchDirection(C10829Sizeof.C37931 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPayee) obj).read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, false);
    }
}
