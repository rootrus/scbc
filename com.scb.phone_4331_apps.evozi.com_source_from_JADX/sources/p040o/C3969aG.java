package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.aG */
public final /* synthetic */ class C3969aG implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C3969aG(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPayee) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
