package p040o;

import android.os.Bundle;
import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.getIJsonExactionHelperRtti */
public class getIJsonExactionHelperRtti extends C5175qU<getTopLeftCornerWidth.setPadding> {
    parseEventSignal IconCompatParcelizer;
    private boolean MediaBrowserCompat$ItemReceiver;
    private int write;

    @HmlPinActivity
    public getIJsonExactionHelperRtti(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        this.write = bundle.getInt("FRAGMENT_TYPE", -1);
        this.IconCompatParcelizer = (parseEventSignal) bundle.get("com.scb.phone.EXTRA_TOP_DISPLAY");
        boolean z = true;
        if (!MediaBrowserCompat$ItemReceiver()) {
            this.MediaBrowserCompat$ItemReceiver = true;
        } else if (this.write == 0) {
            inject_frameView inject_frameview = new inject_frameView(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                inject_frameview.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void write(boolean z) {
        super.write(z);
        if (this.MediaBrowserCompat$ItemReceiver) {
            if (this.write == 0) {
                inject_frameView inject_frameview = new inject_frameView(this);
                if (this.RatingCompat != null) {
                    inject_frameview.IconCompatParcelizer(this.RatingCompat);
                }
            }
            this.MediaBrowserCompat$ItemReceiver = false;
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getTopLeftCornerWidth.setPadding setpadding) {
        CrashlyticsReport.FilesPayload.File.write write2 = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TOP_UP_FUNCTION);
        write2.MediaBrowserCompat$ItemReceiver = false;
        write2.IconCompatParcelizer = true;
        write2.MediaDescriptionCompat = true;
        write2.RatingCompat = true;
        setpadding.MediaBrowserCompat$CustomActionResultReceiver(new CrashlyticsReport.FilesPayload.File(write2, (byte) 0));
    }
}
