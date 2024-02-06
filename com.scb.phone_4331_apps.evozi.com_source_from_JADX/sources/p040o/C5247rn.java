package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.rn */
public final /* synthetic */ class C5247rn implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7475st read;

    public /* synthetic */ C5247rn(C7475st stVar) {
        this.read = stVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver) obj).write(this.read.write);
    }
}
