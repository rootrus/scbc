package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isEdgeFound */
public final /* synthetic */ class isEdgeFound implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isEdgeFound(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
