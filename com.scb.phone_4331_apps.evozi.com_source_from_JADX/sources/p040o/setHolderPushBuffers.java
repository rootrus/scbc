package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.setHolderPushBuffers */
public final /* synthetic */ class setHolderPushBuffers implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int read;

    public /* synthetic */ setHolderPushBuffers(int i) {
        this.read = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
