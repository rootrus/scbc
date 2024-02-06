package p040o;

import java.util.List;
import p040o.Futures;
import p040o.getTransit;

/* renamed from: o.writeFileStatusEvent */
public class writeFileStatusEvent extends writeUInt64NoTag<getTransit.IconCompatParcelizer> {
    public List<Futures.C34051> IconCompatParcelizer;

    @HmlPinActivity
    public writeFileStatusEvent(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final void IconCompatParcelizer(int i) {
        Futures.C34051 r5 = this.IconCompatParcelizer.get(i);
        purge purge = new purge(r5);
        boolean z = true;
        if (this.RatingCompat != null) {
            purge.IconCompatParcelizer(this.RatingCompat);
        }
        if (r5.setHasDecor) {
            removeAppStatsThresholdListener removeappstatsthresholdlistener = new removeAppStatsThresholdListener(r5);
            if (this.RatingCompat != null) {
                removeappstatsthresholdlistener.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            setRamSizeThreshold setramsizethreshold = new setRamSizeThreshold(r5);
            if (this.RatingCompat != null) {
                setramsizethreshold.IconCompatParcelizer(this.RatingCompat);
            }
        }
        removeAppStatsExportListener removeappstatsexportlistener = new removeAppStatsExportListener(r5);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            removeappstatsexportlistener.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
