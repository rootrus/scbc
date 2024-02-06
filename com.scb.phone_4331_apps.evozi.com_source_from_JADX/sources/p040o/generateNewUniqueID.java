package p040o;

/* renamed from: o.generateNewUniqueID */
public final /* synthetic */ class generateNewUniqueID implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ AppStatsInstanceType MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ generateNewUniqueID(AppStatsInstanceType appStatsInstanceType) {
        this.MediaBrowserCompat$CustomActionResultReceiver = appStatsInstanceType;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsInstanceType appStatsInstanceType = this.MediaBrowserCompat$CustomActionResultReceiver;
        createUpdateStatement createupdatestatement = new createUpdateStatement(appStatsInstanceType, obj);
        if (appStatsInstanceType.RatingCompat != null) {
            createupdatestatement.IconCompatParcelizer(appStatsInstanceType.RatingCompat);
        }
    }
}
