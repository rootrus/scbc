package p040o;

/* renamed from: o.dateStringFromEventTime */
public final /* synthetic */ class dateStringFromEventTime implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ AppStatsInstanceType write;

    public /* synthetic */ dateStringFromEventTime(AppStatsInstanceType appStatsInstanceType) {
        this.write = appStatsInstanceType;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsInstanceType appStatsInstanceType = this.write;
        getAppStatsSessionKey getappstatssessionkey = new getAppStatsSessionKey(appStatsInstanceType, (Throwable) obj);
        if (appStatsInstanceType.RatingCompat != null) {
            getappstatssessionkey.IconCompatParcelizer(appStatsInstanceType.RatingCompat);
        }
    }
}
