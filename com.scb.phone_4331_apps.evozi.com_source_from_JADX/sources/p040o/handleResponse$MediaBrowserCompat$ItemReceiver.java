package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.handleResponse$MediaBrowserCompat$ItemReceiver */
public final class handleResponse$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getPayeeEndorsement> {
    private /* synthetic */ boolean IconCompatParcelizer;

    public handleResponse$MediaBrowserCompat$ItemReceiver(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getPayeeEndorsement) obj).write(!this.IconCompatParcelizer);
    }
}
