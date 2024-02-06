package p040o;

import p040o.LogFileManager;
import p040o.writeUInt64NoTag;

/* renamed from: o.CrashlyticsReportPersistence$$Lambda$1 */
public final /* synthetic */ class CrashlyticsReportPersistence$$Lambda$1 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LogFileManager.DirectoryProvider MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ CrashlyticsReportPersistence$$Lambda$1(LogFileManager.DirectoryProvider directoryProvider) {
        this.MediaBrowserCompat$ItemReceiver = directoryProvider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBelowMinRearImageSize) obj).ParcelableVolumeInfo(this.MediaBrowserCompat$ItemReceiver);
    }
}
