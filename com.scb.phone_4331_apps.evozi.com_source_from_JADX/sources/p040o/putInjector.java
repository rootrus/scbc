package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.putInjector */
public final /* synthetic */ class putInjector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4198cm IconCompatParcelizer;
    private final /* synthetic */ getProjection MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ putInjector(C4198cm cmVar, getProjection getprojection) {
        this.IconCompatParcelizer = cmVar;
        this.MediaBrowserCompat$ItemReceiver = getprojection;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4198cm cmVar = this.IconCompatParcelizer;
        getProjection getprojection = this.MediaBrowserCompat$ItemReceiver;
        readBytes readbytes = cmVar.read;
        getMinZoomLevel getminzoomlevel = getprojection.MediaMetadataCompat;
        cmVar.MediaBrowserCompat$MediaItem.read.setCheckable();
        ((KtaJsonCheck$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(readbytes.MediaBrowserCompat$ItemReceiver(getminzoomlevel));
    }
}
