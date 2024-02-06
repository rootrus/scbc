package p040o;

/* renamed from: o.getAppStatsDaoObjSizeInstCnt */
public final /* synthetic */ class getAppStatsDaoObjSizeInstCnt implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ AppStatsInstanceType MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getAppStatsDaoObjSizeInstCnt(AppStatsInstanceType appStatsInstanceType) {
        this.MediaBrowserCompat$ItemReceiver = appStatsInstanceType;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsInstanceType appStatsInstanceType = this.MediaBrowserCompat$ItemReceiver;
        createInsertStatement createinsertstatement = new createInsertStatement(appStatsInstanceType, (getICheckDetector) obj);
        if (appStatsInstanceType.RatingCompat != null) {
            createinsertstatement.IconCompatParcelizer(appStatsInstanceType.RatingCompat);
        }
    }
}
