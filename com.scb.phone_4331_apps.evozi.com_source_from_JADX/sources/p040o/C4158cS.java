package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.cS */
public final /* synthetic */ class C4158cS implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4158cS(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck$MediaBrowserCompat$MediaItem) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
