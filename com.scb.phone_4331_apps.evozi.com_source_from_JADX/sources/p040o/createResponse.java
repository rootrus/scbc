package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.createResponse */
public final /* synthetic */ class createResponse implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ parseOs MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ RttiBillExtractor write;

    public /* synthetic */ createResponse(RttiBillExtractor rttiBillExtractor, parseOs parseos, boolean z) {
        this.write = rttiBillExtractor;
        this.MediaBrowserCompat$ItemReceiver = parseos;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        RttiBillExtractor rttiBillExtractor = this.write;
        parseOs parseos = this.MediaBrowserCompat$ItemReceiver;
        ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver(CheckedFuture.write(parseos, rttiBillExtractor.write), this.IconCompatParcelizer);
    }
}
