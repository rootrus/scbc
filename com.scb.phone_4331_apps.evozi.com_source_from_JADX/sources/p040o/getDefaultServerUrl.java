package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDefaultServerUrl */
public final /* synthetic */ class getDefaultServerUrl implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ parseOs read;
    private final /* synthetic */ RttiBillExtractor write;

    public /* synthetic */ getDefaultServerUrl(RttiBillExtractor rttiBillExtractor, parseOs parseos, boolean z) {
        this.write = rttiBillExtractor;
        this.read = parseos;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        RttiBillExtractor rttiBillExtractor = this.write;
        parseOs parseos = this.read;
        boolean z = this.IconCompatParcelizer;
        parseSession parsesession = rttiBillExtractor.MediaBrowserCompat$ItemReceiver;
        parsesession.MediaBrowserCompat$CustomActionResultReceiver = parseos.write;
        parsesession.MediaDescriptionCompat = parseos.read;
        parsesession.write = parseos.MediaBrowserCompat$ItemReceiver;
        parsesession.read = parseos.MediaBrowserCompat$CustomActionResultReceiver;
        parsesession.RatingCompat = IGoogleMapDelegate.OWN;
        ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver(parsesession, z);
    }
}
