package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.lT */
public final /* synthetic */ class C4932lT implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ buildNameMap MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4932lT(buildNameMap buildnamemap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = buildnamemap;
    }

    public final void IconCompatParcelizer(Object obj) {
        buildNameMap buildnamemap = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((QuickExtractorAgent) obj).MediaBrowserCompat$ItemReceiver(buildnamemap.read, buildnamemap.MediaBrowserCompat$ItemReceiver);
    }
}
