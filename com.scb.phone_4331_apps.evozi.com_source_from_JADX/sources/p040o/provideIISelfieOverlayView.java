package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.provideIISelfieOverlayView */
public final /* synthetic */ class provideIISelfieOverlayView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosY MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ provideIISelfieOverlayView(getPosY getposy) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposy;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosY getposy = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((RttiPassportExtractor_Factory) obj).write((getposy.MediaBrowserCompat$MediaItem == null || getposy.MediaBrowserCompat$SearchResultReceiver == null || getposy.MediaMetadataCompat == null) ? false : true);
    }
}
