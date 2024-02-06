package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getICameraView */
public final /* synthetic */ class getICameraView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C4162cY MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getICameraView(C4162cY cYVar, String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = cYVar;
        this.IconCompatParcelizer = str;
        this.read = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4162cY cYVar = this.MediaBrowserCompat$ItemReceiver;
        ((KtaJsonCheck$MediaBrowserCompat$CustomActionResultReceiver) obj).MediaBrowserCompat$ItemReceiver(cYVar.MediaDescriptionCompat, cYVar.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer, this.read, cYVar.MediaMetadataCompat.ParcelableVolumeInfo, cYVar.MediaBrowserCompat$MediaItem);
    }
}
