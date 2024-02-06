package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.CharMatcher;

/* renamed from: o.postErrorInfoBusEvent */
public class postErrorInfoBusEvent extends writeUInt64NoTag<C1594tV> {
    AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder IconCompatParcelizer;
    public final AppendableWriter read;
    public final CharMatcher.LookupTable write;

    @HmlPinActivity
    public postErrorInfoBusEvent(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, AppendableWriter appendableWriter) {
        super(regularImmutableBiMap);
        this.write = lookupTable;
        this.read = appendableWriter;
    }

    public final void read(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder) {
        this.IconCompatParcelizer = crashlyticsReportSessionUserEncoder;
        if (this.write.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo == null || !this.write.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo.equals(crashlyticsReportSessionUserEncoder.write)) {
            this.write.MediaBrowserCompat$ItemReceiver = crashlyticsReportSessionUserEncoder.write;
            this.write.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = crashlyticsReportSessionUserEncoder.write;
            this.write.write().IconCompatParcelizer = standardSize.MediaBrowserCompat$ItemReceiver();
            unsafeCompare unsafecompare = this.write.write().MediaBrowserCompat$ItemReceiver;
            unsafecompare.MediaBrowserCompat$CustomActionResultReceiver = "";
            unsafecompare.MediaBrowserCompat$ItemReceiver = "";
            unsafecompare.read = "";
            unsafecompare.MediaSessionCompat$QueueItem = "";
            unsafecompare.RatingCompat = this.write.read();
        }
    }
}
