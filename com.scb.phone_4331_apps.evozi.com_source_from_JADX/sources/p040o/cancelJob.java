package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.cancelJob */
public class cancelJob extends writeUInt64NoTag<getGrayLevelStreakMaxHeight> {
    public final StreetViewPanoramaLink IconCompatParcelizer;
    public populateExecutionData read;
    public List<CrashlyticsReportDataCapture> write;

    @HmlPinActivity
    public cancelJob(StreetViewPanoramaLink streetViewPanoramaLink, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = streetViewPanoramaLink;
    }

    public final void read() {
        List list;
        this.write = new ArrayList();
        populateExecutionData populateexecutiondata = this.read;
        if (populateexecutiondata != null) {
            list = populateexecutiondata.read;
        } else {
            list = new ArrayList();
        }
        boolean z = true;
        getParamValues getparamvalues = new getParamValues(new show(list).write(new registerMarshallers(this)) && !list.isEmpty());
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getparamvalues.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(cancelJob canceljob) {
        if (canceljob.RatingCompat != null) {
            canceljob.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(cancelJob canceljob) {
        if (canceljob.RatingCompat != null) {
            canceljob.RatingCompat.aj_();
        }
    }
}
