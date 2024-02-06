package p040o;

import p040o.AppStatsDao;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDsOperation */
public final /* synthetic */ class getDsOperation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsOCRType MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ getDsOperation(AppStatsOCRType appStatsOCRType, String str) {
        this.MediaBrowserCompat$ItemReceiver = appStatsOCRType;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsOCRType appStatsOCRType = this.MediaBrowserCompat$ItemReceiver;
        ((getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj).MediaBrowserCompat$MediaItem(this.write);
        boolean z = true;
        AppStatsDao.C3030c cVar = new AppStatsDao.C3030c(appStatsOCRType, true);
        if (appStatsOCRType.RatingCompat == null) {
            z = false;
        }
        if (z) {
            cVar.IconCompatParcelizer(appStatsOCRType.RatingCompat);
        }
    }
}
