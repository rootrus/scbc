package p040o;

import p040o.AppStatsDao;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeToDb */
public final /* synthetic */ class writeToDb implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsOCRType IconCompatParcelizer;

    public /* synthetic */ writeToDb(AppStatsOCRType appStatsOCRType) {
        this.IconCompatParcelizer = appStatsOCRType;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsOCRType appStatsOCRType = this.IconCompatParcelizer;
        ((getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj).read();
        boolean z = false;
        AppStatsDao.C3030c cVar = new AppStatsDao.C3030c(appStatsOCRType, false);
        if (appStatsOCRType.RatingCompat != null) {
            z = true;
        }
        if (z) {
            cVar.IconCompatParcelizer(appStatsOCRType.RatingCompat);
        }
    }
}
