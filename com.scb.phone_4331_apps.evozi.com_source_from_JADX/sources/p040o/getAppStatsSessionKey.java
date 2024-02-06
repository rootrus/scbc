package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAppStatsSessionKey */
public final /* synthetic */ class getAppStatsSessionKey implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ AppStatsInstanceType write;

    public /* synthetic */ getAppStatsSessionKey(AppStatsInstanceType appStatsInstanceType, Throwable th) {
        this.write = appStatsInstanceType;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsInstanceType appStatsInstanceType = this.write;
        Throwable th = this.IconCompatParcelizer;
        fromExtractorField fromextractorfield = (fromExtractorField) obj;
        fromextractorfield.aj_();
        fromextractorfield.write(appStatsInstanceType.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
