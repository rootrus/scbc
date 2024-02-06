package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setDsFieldType */
public final /* synthetic */ class setDsFieldType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onExportAppStatsRowEvent write;

    public /* synthetic */ setDsFieldType(onExportAppStatsRowEvent onexportappstatsrowevent) {
        this.write = onexportappstatsrowevent;
    }

    public final void IconCompatParcelizer(Object obj) {
        onExportAppStatsRowEvent onexportappstatsrowevent = this.write;
        ((getAverageSpotNoiseGroupingsPerSquareInch) obj).MediaBrowserCompat$ItemReceiver(onexportappstatsrowevent.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(onexportappstatsrowevent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.AppCompatActivity()));
    }
}
