package p040o;

import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.getAltClassificationConfidence */
public final /* synthetic */ class getAltClassificationConfidence implements dump {
    private final /* synthetic */ postErrorInfoBusEvent MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getAltClassificationConfidence(postErrorInfoBusEvent posterrorinfobusevent) {
        this.MediaBrowserCompat$ItemReceiver = posterrorinfobusevent;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        postErrorInfoBusEvent posterrorinfobusevent = this.MediaBrowserCompat$ItemReceiver;
        setStyle setstyle = (setStyle) obj;
        posterrorinfobusevent.read((AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder) setstyle.IconCompatParcelizer);
        ImgCaptureEventDao imgCaptureEventDao = new ImgCaptureEventDao(setstyle);
        if (posterrorinfobusevent.RatingCompat != null) {
            imgCaptureEventDao.IconCompatParcelizer(posterrorinfobusevent.RatingCompat);
        }
    }
}
