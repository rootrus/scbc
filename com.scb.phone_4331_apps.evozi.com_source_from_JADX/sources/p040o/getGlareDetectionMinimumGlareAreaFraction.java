package p040o;

import p040o.access$2300;
import p040o.setShadowDetection;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGlareDetectionMinimumGlareAreaFraction */
public final /* synthetic */ class getGlareDetectionMinimumGlareAreaFraction implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setShadowDetection.C53722 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getGlareDetectionMinimumGlareAreaFraction(setShadowDetection.C53722 r1, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setShadowDetection.C53722 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getRestrictiveEndorsement) obj).write(setShadowDetection.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
