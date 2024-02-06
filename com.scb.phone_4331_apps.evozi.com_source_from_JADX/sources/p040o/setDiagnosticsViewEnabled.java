package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsCore;
import p040o.getImageWidth;
import p040o.isProximityOn;

/* renamed from: o.setDiagnosticsViewEnabled */
public class setDiagnosticsViewEnabled extends removeAboutToCaptureListener<getImageWidth.IconCompatParcelizer.read> {
    public OffsetDateTime IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public CrashlyticsCore.C32494 write;

    @HmlPinActivity
    public setDiagnosticsViewEnabled(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(CrashlyticsCore.C32494 r3, getImageWidth.IconCompatParcelizer.read read) {
        read.IconCompatParcelizer();
        isProximityOn.read read2 = isProximityOn.read();
        read2.write = "O";
        read2.MediaBrowserCompat$ItemReceiver = null;
        read.read(new isProximityOn(read2, (byte) 0));
        read.write(r3.MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(OffsetDateTime offsetDateTime) {
        this.IconCompatParcelizer = offsetDateTime;
        getGuidanceFrameThickness getguidanceframethickness = new getGuidanceFrameThickness(this, offsetDateTime);
        boolean z = true;
        if (this.RatingCompat != null) {
            getguidanceframethickness.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.IconCompatParcelizer != null) {
            getHoldParallelMessage getholdparallelmessage = getHoldParallelMessage.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getholdparallelmessage.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        addJustCapturedListener addjustcapturedlistener = addJustCapturedListener.read;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            addjustcapturedlistener.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
