package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setPassportSampleImage */
public final /* synthetic */ class setPassportSampleImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10829Sizeof MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setPassportSampleImage(C10829Sizeof sizeof) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sizeof;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read.read.setForceShowIcon();
        ((CheckParameters) obj).MediaBrowserCompat$MediaItem();
    }
}
