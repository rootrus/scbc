package p040o;

import p040o.CheckParameters;
import p040o.StandardTable;

/* renamed from: o.getCropLineColor */
public class getCropLineColor extends writeUInt64NoTag<CheckParameters.write> {
    public String IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final StandardTable.CellSet MediaBrowserCompat$ItemReceiver;
    public final StreetViewPanoramaLink read;
    public MetaDataStore write;

    @HmlPinActivity
    public getCropLineColor(StreetViewPanoramaLink streetViewPanoramaLink, StandardTable.CellSet cellSet, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.read = streetViewPanoramaLink;
        this.MediaBrowserCompat$ItemReceiver = cellSet;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCropLineColor getcroplinecolor) {
        if (getcroplinecolor.RatingCompat != null) {
            getcroplinecolor.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getCropLineColor getcroplinecolor) {
        if (getcroplinecolor.RatingCompat != null) {
            getcroplinecolor.RatingCompat.aj_();
        }
    }
}
