package p040o;

import p040o.access$2300;
import p040o.setShadowDetection;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGlareDetectionNumberOfTiles */
public final /* synthetic */ class getGlareDetectionNumberOfTiles implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setShadowDetection.C53715 IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getGlareDetectionNumberOfTiles(setShadowDetection.C53715 r1, Throwable th) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setShadowDetection.C53715 r0 = this.IconCompatParcelizer;
        ((getRestrictiveEndorsement) obj).write(setShadowDetection.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.NAVIGATE_BACK));
    }
}
