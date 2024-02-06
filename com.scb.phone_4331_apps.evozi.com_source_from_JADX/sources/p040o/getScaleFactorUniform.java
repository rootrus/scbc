package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getScaleFactorUniform */
public final /* synthetic */ class getScaleFactorUniform implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ putInstance MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ onStreetViewPanoramaLongClick read;
    private final /* synthetic */ C10077x68f725e7 write;

    public /* synthetic */ getScaleFactorUniform(C10077x68f725e7 nativewritepngimage_mediabrowsercompat_customactionresultreceiver, onStreetViewPanoramaLongClick onstreetviewpanoramalongclick, putInstance putinstance, String str) {
        this.write = nativewritepngimage_mediabrowsercompat_customactionresultreceiver;
        this.read = onstreetviewpanoramalongclick;
        this.MediaBrowserCompat$ItemReceiver = putinstance;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10077x68f725e7 nativewritepngimage_mediabrowsercompat_customactionresultreceiver = this.write;
        ((getTopLeftCornerWidth.RatingCompat) obj).IconCompatParcelizer(nativewritepngimage_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver(this.read, nativewritepngimage_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
