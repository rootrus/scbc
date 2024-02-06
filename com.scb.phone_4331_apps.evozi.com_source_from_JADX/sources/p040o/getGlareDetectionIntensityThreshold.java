package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getGlareDetectionIntensityThreshold */
public final /* synthetic */ class getGlareDetectionIntensityThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setShadowDetection read;

    public /* synthetic */ getGlareDetectionIntensityThreshold(setShadowDetection setshadowdetection) {
        this.read = setshadowdetection;
    }

    public final void IconCompatParcelizer(Object obj) {
        setShadowDetection setshadowdetection = this.read;
        ((getRestrictiveEndorsement) obj).MediaBrowserCompat$CustomActionResultReceiver(setshadowdetection.MediaBrowserCompat$SearchResultReceiver, setshadowdetection.MediaDescriptionCompat, false);
    }
}
