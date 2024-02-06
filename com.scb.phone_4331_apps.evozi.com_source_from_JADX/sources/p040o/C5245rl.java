package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.rl */
public final /* synthetic */ class C5245rl implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7475st MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C5245rl(C7475st stVar) {
        this.MediaBrowserCompat$ItemReceiver = stVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver) obj).read(this.MediaBrowserCompat$ItemReceiver.write);
    }
}
