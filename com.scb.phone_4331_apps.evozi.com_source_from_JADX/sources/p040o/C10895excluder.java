package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.excluder  reason: case insensitive filesystem */
public final /* synthetic */ class C10895excluder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;

    public /* synthetic */ C10895excluder(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        toJsonTree.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, (getLicense) obj);
    }
}
