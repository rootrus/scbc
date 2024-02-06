package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getGuideLineRenderer */
public final /* synthetic */ class getGuideLineRenderer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ C4162cY MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ getGuideLineRenderer(C4162cY cYVar, String str, String str2, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = cYVar;
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4162cY cYVar = this.MediaBrowserCompat$ItemReceiver;
        ((KtaJsonCheck$MediaBrowserCompat$CustomActionResultReceiver) obj).MediaBrowserCompat$ItemReceiver(cYVar.MediaDescriptionCompat, cYVar.MediaBrowserCompat$SearchResultReceiver, this.write, this.read, this.IconCompatParcelizer, cYVar.MediaBrowserCompat$MediaItem);
    }
}
