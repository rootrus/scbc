package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.BarCodeFoundListener */
public final /* synthetic */ class BarCodeFoundListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ BarCodeFoundListener(int i, int i2) {
        this.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).IconCompatParcelizer(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
