package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.copyToTempImage */
public final /* synthetic */ class copyToTempImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDomain MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ copyToTempImage(setDomain setdomain) {
        this.MediaBrowserCompat$ItemReceiver = setdomain;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain setdomain = this.MediaBrowserCompat$ItemReceiver;
        ((ExtractionParameters_Factory) obj).read(setdomain.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setdomain.MediaBrowserCompat$ItemReceiver.read));
    }
}
