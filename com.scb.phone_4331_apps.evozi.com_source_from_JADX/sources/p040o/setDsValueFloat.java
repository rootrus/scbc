package p040o;

import java.io.File;
import p040o.PlacesOptions;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDsValueFloat */
public final /* synthetic */ class setDsValueFloat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onExportAppStatsRowEvent MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setDsValueFloat(onExportAppStatsRowEvent onexportappstatsrowevent) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onexportappstatsrowevent;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAverageSpotNoiseGroupingsPerSquareInch) obj).IconCompatParcelizer(new File(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.RatingCompat.IconCompatParcelizer(), PlacesOptions.Builder.BG_LOGIN.component));
    }
}
