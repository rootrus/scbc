package p040o;

import p040o.QuickExtractorAgent;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImageCapturedBusEvent */
public final /* synthetic */ class ImageCapturedBusEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFileSHA write;

    public /* synthetic */ ImageCapturedBusEvent(getFileSHA getfilesha) {
        this.write = getfilesha;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent.C70191) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}
