package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.cP */
public final /* synthetic */ class C9873cP implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDisplayVersion IconCompatParcelizer;
    private final /* synthetic */ C4213cq MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ C9873cP(C4213cq cqVar, setDisplayVersion setdisplayversion, String str) {
        this.MediaBrowserCompat$ItemReceiver = cqVar;
        this.IconCompatParcelizer = setdisplayversion;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4213cq cqVar = this.MediaBrowserCompat$ItemReceiver;
        ((KtaJsonCheck$MediaBrowserCompat$MediaItem) obj).write(this.IconCompatParcelizer, cqVar.write, this.read);
    }
}
