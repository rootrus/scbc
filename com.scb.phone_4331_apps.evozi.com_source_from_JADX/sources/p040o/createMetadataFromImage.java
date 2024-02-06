package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.createMetadataFromImage */
public final /* synthetic */ class createMetadataFromImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDomain write;

    public /* synthetic */ createMetadataFromImage(setDomain setdomain) {
        this.write = setdomain;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain setdomain = this.write;
        ((ExtractionParameters_Factory) obj).write(setdomain.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setdomain.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem));
    }
}
