package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.createInsertStatement */
public final /* synthetic */ class createInsertStatement implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getICheckDetector MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AppStatsInstanceType read;

    public /* synthetic */ createInsertStatement(AppStatsInstanceType appStatsInstanceType, getICheckDetector geticheckdetector) {
        this.read = appStatsInstanceType;
        this.MediaBrowserCompat$ItemReceiver = geticheckdetector;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsInstanceType appStatsInstanceType = this.read;
        getICheckDetector geticheckdetector = this.MediaBrowserCompat$ItemReceiver;
        fromExtractorField fromextractorfield = (fromExtractorField) obj;
        appStatsInstanceType.IconCompatParcelizer.RatingCompat = geticheckdetector.IconCompatParcelizer;
        fromextractorfield.aj_();
        fromextractorfield.MediaBrowserCompat$ItemReceiver();
    }
}
