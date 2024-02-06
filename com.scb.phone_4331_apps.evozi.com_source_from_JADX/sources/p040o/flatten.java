package p040o;

import p040o.C10178z;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.flatten */
public final /* synthetic */ class flatten implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onStreetViewPanoramaLongClick MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C10178z.C547010.C54711.write read;

    public /* synthetic */ flatten(C10178z.C547010.C54711.write write, onStreetViewPanoramaLongClick onstreetviewpanoramalongclick) {
        this.read = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = onstreetviewpanoramalongclick;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10178z.C547010.C54711.write write = this.read;
        ((getCarbonStrip.MediaDescriptionCompat) obj).IconCompatParcelizer(C10178z.C547010.C54711.this.read.write(this.MediaBrowserCompat$CustomActionResultReceiver, C10178z.C547010.C54711.this.write));
    }
}
