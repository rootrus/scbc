package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.sE */
public class C7430sE extends writeUInt64NoTag<getTopLeftCornerWidth.PlaybackStateCompat> {
    public final Polygon read;
    /* access modifiers changed from: private */
    public final C5421state write;

    @HmlPinActivity
    public C7430sE(RegularImmutableBiMap regularImmutableBiMap, Polygon polygon, C5421state state) {
        super(regularImmutableBiMap);
        this.read = polygon;
        this.write = state;
    }

    static /* synthetic */ void write(C7430sE sEVar) {
        if (sEVar.RatingCompat != null) {
            sEVar.RatingCompat.aj_();
        }
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution, boolean z) {
        if (execution.setHasDecor != null) {
            execution.setHasDecor.MediaBrowserCompat$ItemReceiver = z;
            if (z) {
                execution.setGroupDividerEnabled = execution.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
        C10141sW sWVar = new C10141sW(execution);
        if (this.RatingCompat != null) {
            sWVar.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
