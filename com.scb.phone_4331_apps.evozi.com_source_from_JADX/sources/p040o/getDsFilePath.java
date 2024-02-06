package p040o;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDsFilePath */
public final /* synthetic */ class getDsFilePath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onExportAppStatsRowEvent MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDsFilePath(onExportAppStatsRowEvent onexportappstatsrowevent) {
        this.MediaBrowserCompat$ItemReceiver = onexportappstatsrowevent;
    }

    public final void IconCompatParcelizer(Object obj) {
        onExportAppStatsRowEvent onexportappstatsrowevent = this.MediaBrowserCompat$ItemReceiver;
        long MediaBrowserCompat$ItemReceiver2 = onexportappstatsrowevent.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(MediaBrowserCompat$ItemReceiver2);
        ((getAverageSpotNoiseGroupingsPerSquareInch) obj).read(simpleDateFormat.format(instance.getTime()), String.valueOf(onexportappstatsrowevent.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()), String.valueOf(onexportappstatsrowevent.IconCompatParcelizer.IconCompatParcelizer()));
    }
}
